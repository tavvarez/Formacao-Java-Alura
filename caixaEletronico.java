import java.util.Scanner;

public class caixaEletronico {
    
    private static double saldo = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("----- Caixa Eletrônico -----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Transferir Saldo");
            System.out.println("3. Receber Saldo");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    System.out.print("Informe o valor para transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    transferirSaldo(valorTransferencia);
                    break;
                case 3:
                    System.out.print("Informe o valor para receber: ");
                    double valorRecebido = scanner.nextDouble();
                    receberSaldo(valorRecebido);
                    break;
                case 4:
                    System.out.println("\nObrigado por usar o Caixa Eletrônico!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

            System.out.println();
        } while (opcao != 4);

        scanner.close();
    }

    private static void consultarSaldo() {
        System.out.println("\nSeu saldo atual é: " + saldo);
    }

    private static void transferirSaldo(double valor) {
        if (valor > saldo) {
            System.out.println("\nSaldo insuficiente para transferência!");
        } else {
            saldo -= valor;
            System.out.println("\nTransferência realizada com sucesso!");
        }
    }

    private static void receberSaldo(double valor) {
        saldo += valor;
        System.out.println("\nValor recebido com sucesso!");
    }
}
