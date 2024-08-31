import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {
    public static String ceaserCypher(String palavra, int index) {
        if (index == palavra.length()) {
            return "";
        } else {
            char c = palavra.charAt(index);
            if (c != 65533) {
                return (char) (c + 3) + ceaserCypher(palavra, index + 1);
            } else {
                return "\uFFFD" + ceaserCypher(palavra, index + 1);
            }
        }
    }

    public static void readInput(InputStreamReader reader, StringBuilder buffer) throws IOException {
        int ch = reader.read();
        if (ch == -1 || (buffer.length() > 2 && buffer.charAt(0) == 'F' && buffer.charAt(1) == 'I' && buffer.charAt(2) == 'M')) {
            return;
        }
        if (ch == '\n') {
            String newWord = ceaserCypher(buffer.toString(), 0);
            System.out.println(newWord);
            buffer.setLength(0);
        } else {
            buffer.append((char) ch);
        }
        readInput(reader, buffer);
    }

    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in, "UTF-8");
            readInput(reader, new StringBuilder());
        } catch (IOException e) {
            
        }
    }
}