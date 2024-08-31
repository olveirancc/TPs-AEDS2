import java.io.IOException;
import java.io.InputStreamReader;

public class Q3{
	public static String ceaserCypher(String palavra){
		int key = 3;
		StringBuilder newWord = new StringBuilder();
		for(int i = 0; i < palavra.length(); i++){
			if(palavra.charAt(i) != 65533)
				newWord.append((char)(palavra.charAt(i)+key));
			else
				newWord.append("\uFFFD");
		}
		return newWord.toString();
	}
    public static void main(String[] args){
        try {
            InputStreamReader reader = new InputStreamReader(System.in, "UTF-8");
            StringBuilder buffer = new StringBuilder();
            int ch;
            while((ch = reader.read()) != -1){
				if (buffer.length() > 2 && buffer.charAt(0) == 'F' && buffer.charAt(1) == 'I' && buffer.charAt(2) == 'M')
					break;
                if (ch == '\n') {
                    String newWord = ceaserCypher(buffer.toString());
                    System.out.println(newWord);
                    buffer.setLength(0);
                } else {
                    buffer.append((char)ch);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}