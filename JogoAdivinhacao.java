import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1; // Escolhe um número aleatório entre 1 e 100
        int tentativas = 10; // Número máximo de tentativas
        
        System.out.println("Bem-vindo ao jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");
        
        while (tentativas > 0) {
            System.out.println("Você tem " + tentativas + " tentativas restantes. Digite um numero:");
            int tentativa = scanner.nextInt();
            
            if (tentativa < 1 || tentativa > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
                continue;
            }
            
            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número corretamente em " + (10 - tentativas + 1) + " tentativas.");
                break;
            } else if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
            
            tentativas--;
        }
        
        if (tentativas == 0) {
            System.out.println("Você esgotou todas as tentativas. O número correto era: " + numeroAleatorio);
        }
        
        scanner.close();
    }
}
