import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while (nota != -1) {
            System.out.println("Diga sua avaliação de 0 a 10 OU -1 para encerrar:");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            } else{
                System.out.println("Programa encerrado\n");
            }

        }

        System.out.println("Media de avaliações" + mediaAvaliacao/totalDeNotas);
    }
}
