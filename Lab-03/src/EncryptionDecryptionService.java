import java.io.*;

public class EncryptionDecryptionService {
    private static final String FILE_DIRECTORY = "C:\\OS\\";

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose Encryption Algorithm (AES, DES, CAESAR): ");
        String choice = reader.readLine().toUpperCase();

        System.out.println("Enter the file path to encrypt: ");
        String filePath = reader.readLine();

        // Read file content
        String content = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(filePath)));

        IEncryption encryption = null;
        IDecryption decryption = null;

        switch (choice) {
            case "AES":
                AesEncryption aesEncryption = new AesEncryption();
                encryption = aesEncryption;
                decryption = new AesDecryption(aesEncryption.getKey());
                break;
            case "DES":
                DesEncryption desEncryption = new DesEncryption();
                encryption = desEncryption;
                decryption = new DesDecryption(desEncryption.getKey());
                break;
            case "CAESAR":
                System.out.println("Enter the shift value for Caesar Cipher: ");
                int shift = Integer.parseInt(reader.readLine());
                encryption = new CaesarEncryption(shift);
                decryption = new CaesarDecryption(shift);
                break;
        }

        EncryptionStrategy encryptionStrategy = new EncryptionStrategy(encryption);
        DecryptionStrategy decryptionStrategy = new DecryptionStrategy(decryption);

        // Encrypt the content and save to a new file in the C:\OS directory
        String encryptedContent = encryptionStrategy.encrypt(content);
        saveToFile(encryptedContent, FILE_DIRECTORY + "encrypted_data.txt");

        // Decrypt the content for validation and save to a new file in the C:\OS directory
        String decryptedContent = decryptionStrategy.decrypt(encryptedContent);
        saveToFile(decryptedContent, FILE_DIRECTORY + "decrypted_data.txt");

        System.out.println("Encryption and decryption completed. Files saved at C:\\OS");
    }

    private static void saveToFile(String data, String path) throws IOException {
        File directory = new File(FILE_DIRECTORY);
        if (!directory.exists()) {
            directory.mkdirs();  // Create directory if it doesn't exist
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(data);
        }
    }
}
