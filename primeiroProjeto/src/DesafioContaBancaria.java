import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {

        String nomeCliente = "Henrique Oliveira";
        String tipoDaConta = "Poupança";
        double saldoInicial = 2500.0;

        System.out.println("********************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo da Conta: " + tipoDaConta);
        System.out.println("Saldo Inicial: R$ " + saldoInicial);
        System.out.println("********************************\n");

        String menu = """
                Operações disponíveis:
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                Digite a opção desejada:
                """;

        Scanner leitura = new Scanner(System.in);

        double valorRecebido = 0;
        int opcoes = 0;

        while (opcoes != 4) {
            System.out.println(menu);
            opcoes = leitura.nextInt();
            switch (opcoes) {
                case 1:
                    System.out.println("\nSeu saldo atualizado é de: " + saldoInicial + "\n");
                    break;
                case 2:
                    System.out.println("Digite o valor que você quer receber: ");
                    valorRecebido = leitura.nextDouble();
                    if (valorRecebido > 0) {
                        saldoInicial += valorRecebido;
                        System.out.println("Seu saldo atual é de: R$ " + saldoInicial + "\n");
                    } else {
                        System.out.println("Não é possível receber valor negativo" + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que você quer transferir: ");
                    double valorTransferido = 0;
                    valorTransferido = leitura.nextDouble();
                    if (valorTransferido > saldoInicial || valorTransferido < 0) {
                        System.out.println("\nERRO!!! O que você deseja tranferir é maior ou é um valor negativo que seu saldo atual");
                    } else {
                        saldoInicial -=valorTransferido;
                        System.out.println("\nSeu saldo atual é de: R$ " + saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Fechando aplicativo...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}
