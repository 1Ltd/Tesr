package com.beemdevelopment.Tesser.otp;

import static org.junit.Assert.assertEquals;

import com.beemdevelopment.Tesser.crypto.otp.TOTPTest;

import org.junit.Test;

public class TotpInfoTest {
    @Test
    public void testTotpInfoOtp() throws OtpInfoException {
        for (TOTPTest.Vector vector : TOTPTest.VECTORS) {
            byte[] seed = TOTPTest.getSeed(vector.Algo);
            TotpInfo info = new TotpInfo(seed, vector.Algo, 8, TotpInfo.DEFAULT_PERIOD);
            assertEquals(vector.OTP, info.getOtp(vector.Time));
        }
    }
}
