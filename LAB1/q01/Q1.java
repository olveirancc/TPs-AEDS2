import java.util.Scanner;

class Q1 {
    public static boolean Fim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static int Maiuscula(String s){
        int contador = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') contador++;
        }
        return contador;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        while(!(Fim(entrada))){
            System.out.println(Maiuscula(entrada));
            entrada = scanner.nextLine();
        }
        scanner.close();
    }
}