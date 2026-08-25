package Atividade7;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Banco banco = new Banco();
        int opc = -1;

        while (opc != 0) {

            System.out.println("=-=-=-=-=-=- SISTEMA BANCÁRIO -=-=-=-=-=-=-=-");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Aplicar rendimento");
            System.out.println("8 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (!entrada.hasNextInt()) {
                System.out.println("Opção inválida! Digite apenas números.");
                entrada.nextLine();
                continue;
            }

            opc = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer do teclado

            if (opc == 1) {
                System.out.print("Nome do titular: ");
                String nome = entrada.nextLine();
                System.out.print("CPF: ");
                String cpf = entrada.nextLine();
                System.out.print("Data de Nascimento: ");
                String data = entrada.nextLine();
                System.out.print("Saldo inicial: R$ ");
                double saldoInicial = entrada.nextDouble();

                Titular titular = new Titular(nome, cpf, data);
                banco.abrirConta(titular, saldoInicial);

            } else if (opc == 2) {
                System.out.print("Número da conta: ");
                int num = entrada.nextInt();
                System.out.print("Valor do saque: R$ ");
                double valor = entrada.nextDouble();
                banco.sacar(num, valor);

            } else if (opc == 3) {
                System.out.print("Número da conta: ");
                int num = entrada.nextInt();
                System.out.print("Valor do depósito: R$ ");
                double valor = entrada.nextDouble();
                banco.depositar(num, valor);

            } else if (opc == 4) {
                System.out.print("Número da conta de origem: ");
                int orig = entrada.nextInt();
                System.out.print("Número da conta de destino: ");
                int dest = entrada.nextInt();
                System.out.print("Valor da transferência: R$ ");
                double valor = entrada.nextDouble();
                banco.transferir(orig, dest, valor);

            } else if (opc == 5) {
                System.out.print("Número da conta: ");
                int num = entrada.nextInt();
                banco.consultarSaldo(num);

            } else if (opc == 6) {
                System.out.print("Número da conta: ");
                int num = entrada.nextInt();
                banco.verExtrato(num);

            } else if (opc == 7) {
                System.out.print("Número da conta: ");
                int num = entrada.nextInt();
                System.out.print("Percentual de rendimento (%): ");
                double perc = entrada.nextDouble();
                banco.aplicarRendimento(num, perc);

            } else if (opc == 8) {
                banco.listarContas();

            } else if (opc == 0) {
                System.out.println("Encerrando o sistema do caixa. Até logo!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        entrada.close();
    }
}
