import java.util.Scanner;

public class Q10 {
    public static boolean Fim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean Palindromo(String s, Scanner scanner) {
        if(!Fim(s)){
            for (int i = 0; i <= s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    System.out.println("NAO");
                    s = scanner.nextLine();
                    return Palindromo(s, scanner);
                }
            }
            System.out.println("SIM");
            s = scanner.nextLine();
            return Palindromo(s, scanner);
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        Palindromo(entrada, scanner);
        scanner.close();
    }

}
