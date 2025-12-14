package com.hyz.tesser.otp;

import static org.junit.Assert.assertEquals;

import com.hyz.tesser.crypto.otp.MOTPTest;
import com.hyz.tesser.encoding.EncodingException;
import com.hyz.tesser.encoding.Hex;

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
