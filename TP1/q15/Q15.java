import java.util.Scanner;

public class Q15 {
    public static boolean Fim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }
    public static boolean OnlyVogal(String s){
        for(int i = 0; i < s.length(); i++){
            if(!(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')){
                return false;
            }
        }
        return true;
    }
    public static boolean Inteiro(String s){
        for(int i = 0; i < s.length(); i++){
            if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                return false;
            }
        }
        return true;
    }
    public static boolean Real(String s){
        int contador = 0;       
        for(int i = 0; i < s.length(); i++){
            if(!((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) == '.' || s.charAt(i) == ','))){
                return false;
            }
            if(s.charAt(i) == '.' || s.charAt(i) == ','){
                contador++;
            }
            if(contador > 1) return false;
        }
        return true;
    }
    public static boolean OnlyConsoante(String s){
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')){
                return false;
            }
            if(s.charAt(i) >= '!' && s.charAt(i) <= '@') return false;
        }
        return true;
    }
    public static boolean Check(String s, Scanner scanner){
        if(Fim(s)) return false;
        if (OnlyVogal(s)) {
            System.out.print("SIM ");
        } else {
            System.out.print("NAO ");
        }
        if (OnlyConsoante(s)) {
            System.out.print("SIM ");
        } else {
            System.out.print("NAO ");
        }
        if (Inteiro(s)) {
            System.out.print("SIM ");
        } else {
            System.out.print("NAO ");
        }
        if (Real(s)) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
        s = scanner.nextLine();
        return Check(s, scanner);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        Check(entrada, scanner);
        scanner.close();
    }
}