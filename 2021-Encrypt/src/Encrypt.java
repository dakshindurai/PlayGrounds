import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encrypt {
    public static void main(String[] args){
        String UserName = "cqauser";
        byte[] myByte = {1,2,3};
        Encrypt ec1 = new Encrypt();
        ec1.encrypt(UserName,myByte);
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
        System.out.println(response);
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
