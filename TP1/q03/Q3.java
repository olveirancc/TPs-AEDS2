
import java.util.Scanner;

public class Q3 {
    public static boolean Fim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void Cifra(String s){
        StringBuilder sb = new StringBuilder();
        int chave = 3;
        int ascii;
        char asciinew;
        for(int i = 0; i < s.length(); i++){
            ascii = (int) s.charAt(i);
            ascii += chave;
            asciinew = (char) ascii; 
            sb.append(asciinew);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        while(!(Fim(entrada))){
            Cifra(entrada);
            entrada = scanner.nextLine();
        }
        scanner.close();
    }
}
