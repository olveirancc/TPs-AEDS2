import java.util.Scanner;

public class Q2 {
    public static boolean Fim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static int Maiuscula(String s, Scanner scanner){
        int contador = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') contador++;
        }
        System.out.println(contador);
        s = scanner.nextLine();
        if(Fim(s)) return 0;
        return Maiuscula(s, scanner);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        Maiuscula(entrada, scanner);
        scanner.close();
    }
}
