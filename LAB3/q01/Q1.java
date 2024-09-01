import java.util.Scanner;
public class Q1 {
    public static boolean Fim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean Paran(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (!Fim(s)) {
            if(Paran(s)) System.out.println("correto");
            else System.out.println("incorreto");
            s = scanner.nextLine();    
        }
        scanner.close();
    }
}