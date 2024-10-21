import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anterior, atual, proximo;
        int numero;

        System.out.println("Informe um número: ");
        numero = scanner.nextInt();

        anterior = 0;
        atual = 1;

        while (atual<numero) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        if (numero == atual){
            System.out.println("Seu número faz parte da sequência Fibonacci!");
        } else {
            System.out.println("Seu número não faz parte da sequência Fibonacci...");
        }
        
    }
}
