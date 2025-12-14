package com.beemdevelopment.Tesser.otp;

import static org.junit.Assert.assertEquals;

import com.beemdevelopment.Tesser.crypto.otp.MOTPTest;
import com.beemdevelopment.Tesser.encoding.EncodingException;
import com.beemdevelopment.Tesser.encoding.Hex;

import org.junit.Test;

public class MotpInfoTest {
    @Test
    public void testMotpInfoOtp() throws OtpInfoException, EncodingException {
        for (MOTPTest.Vector vector : MOTPTest.VECTORS) {
            MotpInfo info = new MotpInfo(Hex.decode(vector.Secret), vector.Pin);
            assertEquals(vector.OTP, info.getOtp(vector.Time));
        }
    }
}
