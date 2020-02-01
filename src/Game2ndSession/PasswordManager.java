package Game2ndSession;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Base64;

// Ecrypt passwords and decrypt them
//tbd
public class PasswordManager {
    public SecretKey generateNewKey() throws GeneralSecurityException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);        // options are 128, 192, 256
        SecretKey secretKey = keyGenerator.generateKey();
        return secretKey;
    }

    private static SecretKey buildKey() throws GeneralSecurityException {
        // AES key byte arrays must be exactly 16, 24, or 32 bytes in length
        byte[] keyBytes = new byte[16];
        SecretKey secretKey = null;


//        // OPTION 1 (from a known, previously generated secretKey.getEncoded())
//        keyBytes = new byte[]{-89, -99, 101, -9, 80, 28, 25, -111, -121, -40, 14, 53, 54, 2, 53, 24};
//        secretKey = new SecretKeySpec(keyBytes, "AES");

//        // OPTION 2 (from a known String -- less secure, small pool of byte options)
//        try {
//            String pwdString = "asdfjkl;asdfjkl;";
//            byte[] pwdBytes = pwdString.getBytes("UTF-8");
//            System.arraycopy(pwdBytes, 0, keyBytes, 0,
//                    Math.min(keyBytes.length, pwdBytes.length));
//            secretKey = new SecretKeySpec(keyBytes, "AES");
//        } catch (UnsupportedEncodingException e) {
//            // ignore, this will never happen so we don't want to
//            // force the caller to catch it
//        }

        // OPTION 3 (from a known random seed -- DANGER: might vary in different JVMs)
        long secretSeed = 123456789;
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        random.setSeed(secretSeed);
        keyGenerator.init(128, random);
        secretKey = keyGenerator.generateKey();

        return secretKey;
    }

    private static String encryptString(String plainText, SecretKey secretKey) throws GeneralSecurityException, IOException {
        Cipher cipher = Cipher.getInstance(secretKey.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] textBytes = plainText.getBytes("UTF-8");
        byte[] encryptedBytes = cipher.doFinal(textBytes);

        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedText = encoder.encodeToString(encryptedBytes);
        return encryptedText;
    }

    private static char[] decryptString(String encryptedText, SecretKey secretKey) throws GeneralSecurityException, IOException {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encryptedBytes = decoder.decode(encryptedText);

        Cipher cipher = Cipher.getInstance(secretKey.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        Charset utf8 = StandardCharsets.UTF_8;
        CharBuffer decryptedChars = utf8.decode(ByteBuffer.wrap(decryptedBytes));
        return decryptedChars.array();
    }

    public static void keyTest() {
        try {
            SecretKey secretKey = buildKey();
            String encrypted = encryptString("password", secretKey);
            char[] decrypted = decryptString(encrypted, secretKey);
            System.out.println("encrypted password: " + encrypted);
            System.out.println("decrypted password: " + new String(decrypted));
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        keyTest();
    }
}
