import java.util.Random;
import java.util.Scanner;

public class Q4 {

    public static boolean Fim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String substituirLetras(String input) {
        Random gerador = new Random();
        gerador.setSeed(4);
        char letra1 = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
        char letra2 = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
        String output = input.replace(letra1, letra2);
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        while(!(Fim(entrada))){
            System.out.println(substituirLetras(entrada));
            entrada = scanner.nextLine();
        }
        scanner.close();
    }
}