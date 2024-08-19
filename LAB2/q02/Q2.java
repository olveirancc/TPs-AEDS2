import java.util.Scanner;

public class Q2 {
    public static void Mirror(int x, int y) {
        String s = "";
        for (int i = x; i <= y; i++) {
            s = s + i;
        }
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            s += chars[i];
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        
        while (s.hasNext()) {
            num1 = s.nextInt();
            num2 = s.nextInt();
            Mirror(num1, num2);
        }
        
        s.close();
    }
}