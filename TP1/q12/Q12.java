
import java.util.Scanner;

public class Q12 {
    public static boolean Fim(String s) {
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void Cifra(String s, Scanner scanner) {
        if (!(Fim(s))) {
            StringBuilder sb = new StringBuilder();
            int chave = 3;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                char cifrado = (char) (c + chave);
                sb.append(cifrado);
            }
            System.out.println(sb.toString());
            s = scanner.nextLine();
            Cifra(s, scanner);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        Cifra(entrada, scanner);
        scanner.close();
    }
}