import java.security.NoSuchAlgorithmException;

public class DecryptionStrategy {
    private IDecryption decryptionAlgorithm;

    public DecryptionStrategy(IDecryption decryptionAlgorithm) {
        this.decryptionAlgorithm = decryptionAlgorithm;
    }

    public String decrypt(String data) {
        return decryptionAlgorithm.decrypt(data);
    }
}
