import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoSolo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num;
        int numAleatorio = new Random().nextInt(10);

        System.out.println("#########################################");
        System.out.println("# Seja bem vindo ao jogo de adivinhação #");
        System.out.println("#########################################\n");

        for (int i = 5; i > 0; i--) {
            System.out.println("Digite um número entre 0 a 10:");
            num = leitura.nextInt();

            if (num == numAleatorio) {
                System.out.println("\nVocê acertou, parabéns");
                System.out.println("Obrigado por jogar");
                break;
            } else if (num < numAleatorio) {
                System.out.println("O número é maior");
            } else if (num > numAleatorio) {
                System.out.println("O número é menor");
            }

        }
    }
}
