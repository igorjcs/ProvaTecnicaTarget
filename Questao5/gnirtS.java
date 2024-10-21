package Questao5;
import java.util.*;

public class gnirtS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String palavra = scanner.nextLine();
        palavra = inverter(palavra);
        System.out.print("Palavra invertida: " + palavra);
       
    }

    public static String inverter (String str) {
        char[] letras = str.toCharArray();
        String gnirtS = "";

        for (int i = letras.length -1; i >= 0; i--){
            gnirtS += letras[i];
        }

        return gnirtS;
    }
}
