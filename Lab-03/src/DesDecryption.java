import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.util.Base64;

public class DesDecryption implements IDecryption{
    private static final String ALGORITHM = "DES";
    private SecretKey key;

    public DesDecryption(SecretKey key) {
        this.key = key;
    }

    public DesDecryption() {

    }

    @Override
    public String decrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(data));
            return new String(decrypted);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
