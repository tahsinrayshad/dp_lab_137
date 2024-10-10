import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AesEncryption implements IEncryption {

    private SecretKey secretKey;
    private String algorithm = "AES";


    public AesEncryption() throws Exception {
        secretKey = KeyGenerator.getInstance(algorithm).generateKey();
    }


    @Override
    public String encrypt(String data){
        try{
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        }
        catch (Exception e){
            throw new RuntimeException("Error encrypting data", e);
        }
    }

    public SecretKey getKey() {return secretKey;
    }
}
