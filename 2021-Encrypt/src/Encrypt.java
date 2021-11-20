import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encrypt {
//    public static void main(String[] args){
//        String UserName = "cqauser";
//        String encryptkey = "92548FA7EAF1590B6FD4A0D2949B7FF4EF4696AF4375F3A325276CD68D0C62B7";
//        byte[] myByte = encryptkey.getBytes();
//        Encrypt ec1 = new Encrypt();
//        String response = ec1.encrypt(UserName, myByte);
//        System.out.println(response);
//    }

    public static void main(String[] args){
        Encrypt e1 = new Encrypt();
        String encryptedValue = e1.encrypt("cqauser", e1.simpleDecode("A1D36E6F796F7563616E6E6F746B6E6F7721FB23".substring(4, 36)));
        String decryptedvalue = e1.decrypt(encryptedValue, "A1D36E6F796F7563616E6E6F746B6E6F7721FB23".substring(4, 36).getBytes());
        System.out.println(encryptedValue);
        System.out.println(decryptedvalue);
    }

    private String encrypt(final String value, final byte[] encryptionKey) {
        String response = null;
        try {
            final SecretKeySpec sks = new SecretKeySpec(encryptionKey, "AES");

            final Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, sks, cipher.getParameters());

            byte[] encrypted = cipher.doFinal(value.getBytes());
            response = hexToString(encrypted);
        } catch (Exception e) {
            // Ignoring for now
            // LOGGER.error("Error encrypting: " + e.getMessage(), e);
        }
        return response;
    }

    public String decrypt(final String encrypted, final byte[] encryptionKey) {
        String response = null;
        if (encrypted == null || encrypted.isEmpty()) {
            // Must return "" in the case where a bootstrap property uses the
            // '.decrypt()' option but does not have a value assigned to it.
            // Returning 'null' will result in an NPE for
            // System.setProperty(name, null)
            return "";
        }
        try {
            final SecretKeySpec sks = new SecretKeySpec(encryptionKey, "AES");
            final Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, sks);

            final byte[] decrypted = cipher.doFinal(simpleDecode(encrypted));
            response = new String(decrypted);
        } catch (Exception e) {
            // Ignoring for now
            // LOGGER.error("Error decrypting : " + e.getMessage(), e);
        }
        return response;

    }

    private String hexToString(byte[] b) {
        StringBuffer sb = new StringBuffer(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            int v = b[i] & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }

    public byte[] simpleDecode(String s) {
        byte[] b = new byte[s.length() / 2];
        for (int i = 0; i < b.length; i++) {
            int index = i * 2;
            int v = Integer.parseInt(s.substring(index, index + 2), 16);
            b[i] = (byte) v;
        }
        return b;
    }
}
