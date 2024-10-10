public class CaesarDecryption implements IDecryption{
    private int shift;

    public CaesarDecryption() {

    }
    public CaesarDecryption(int shift) {
        this.shift = shift;
    }

    @Override
    public String decrypt(String data) {
        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) ((character - base - shift + 26) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
