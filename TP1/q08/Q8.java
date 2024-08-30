import java.io.*;
import java.util.Scanner;

public class Q8 {
    public static void Arquivo(String filename, int quantidade) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(filename, "r");
        double[] numeros = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = raf.readDouble();
        }
        for (int i = quantidade - 1; i >= 0; i--) {
            if (isInteiro(numeros[i])) {
                System.out.println((int)numeros[i]);
            } else {
                System.out.println(numeros[i]);
            }
        }
        raf.close();
    }

    public static boolean isInteiro(double n) {
        return n == (int)n;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        RandomAccessFile raf = new RandomAccessFile("Q8.txt", "rw");
        int n = scanner.nextInt();
        double[] numeros = new double[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            raf.writeDouble(numeros[i]);
        }
        raf.close();
        scanner.close();
        Arquivo("Q8.txt", n);
    }
}