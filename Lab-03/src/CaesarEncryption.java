public class CaesarEncryption implements IEncryption{
    private int shift;

    public CaesarEncryption(int shift) {
        this.shift = shift;
    }

    public CaesarEncryption() {

    }

    @Override
    public String encrypt(String data) {
        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
