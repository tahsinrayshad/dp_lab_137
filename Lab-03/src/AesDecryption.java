import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AesDecryption implements IDecryption{

    private SecretKey secretKey;
    private String algorithm = "AES";

    public AesDecryption(SecretKey secretKey){
        this.secretKey = secretKey;
    }

    public AesDecryption() {

    }
    public String decrypt(String data){
        try{
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(data));
            return new String(decrypted);
        }
        catch (Exception e){
            throw new RuntimeException("Error encrypting data", e);
        }
    }
}
