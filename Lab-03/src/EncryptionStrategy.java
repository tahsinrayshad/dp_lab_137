import java.security.NoSuchAlgorithmException;

public class EncryptionStrategy {

    private IEncryption encryptionAlgorithm;

    public EncryptionStrategy(IEncryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public String encrypt(String data) {
        return encryptionAlgorithm.encrypt(data);
    }
}
