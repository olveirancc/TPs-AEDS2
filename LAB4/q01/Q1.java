import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            
            // Finaliza se N e M forem ambos 0
            if (N == 0 && M == 0) {
                System.out.println("0 0");
                break;
            }
            
            // Cria uma lista para armazenar os números
            List<Integer> numeros = new ArrayList<>();
            
            for (int i = 0; i < N; i++) {
                numeros.add(scanner.nextInt());
            }
            
            // Ordena a lista de acordo com as regras do problema
            numeros.sort((a, b) -> {
                int modA = a % M;
                int modB = b % M;
                
                // Primeira comparação: pelo módulo M
                if (modA != modB) {
                    return Integer.compare(modA, modB);
                }
                
                // Segunda comparação: entre ímpares e pares
                boolean aImpar = Math.abs(a) % 2 == 1;
                boolean bImpar = Math.abs(b) % 2 == 1;
                
                if (aImpar && !bImpar) {
                    return -1;
                } else if (!aImpar && bImpar) {
                    return 1;
                }
                
                // Terceira comparação: entre ímpares e entre pares
                if (aImpar && bImpar) {
                    return Integer.compare(b, a); // Ímpares em ordem decrescente
                } else if (!aImpar && !bImpar) {
                    return Integer.compare(a, b); // Pares em ordem crescente
                }
                
                return 0;
            });
            
            // Exibe a saída
            System.out.println(N + " " + M);
            for (int num : numeros) {
                System.out.println(num);
            }
        }
        
        scanner.close();
    }
}