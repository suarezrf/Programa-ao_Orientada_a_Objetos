package Atividade7;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    private int proximoNumero = 1;

    public ContaBancaria abrirConta(Titular titular, double saldoInicial) {
        ContaBancaria novaConta = new ContaBancaria(proximoNumero, titular, saldoInicial);
        contas.add(novaConta);
        System.out.println("Conta criada com sucesso! Número da conta: " + proximoNumero);
        proximoNumero++;
        return novaConta;
    }

    public ContaBancaria buscarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void depositar(int numero, double valor) {
        ContaBancaria conta = buscarConta(numero);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta número " + numero + " não encontrada.");
        }
    }

    public void sacar(int numero, double valor) {
        ContaBancaria conta = buscarConta(numero);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta número " + numero + " não encontrada.");
        }
    }

    public void transferir(int numeroOrigem, int numeroDestino, double valor) {
        if (numeroOrigem == numeroDestino) {
            System.out.println("Operação recusada: não é possível transferir para a mesma conta.");
            return;
        }

        ContaBancaria origem = buscarConta(numeroOrigem);
        ContaBancaria destino = buscarConta(numeroDestino);

        if (origem == null) {
            System.out.println("Conta de origem (" + numeroOrigem + ") não encontrada.");
            return;
        }
        if (destino == null) {
            System.out.println("Conta de destino (" + numeroDestino + ") não encontrada.");
            return;
        }

        if (origem.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência.");
        }
    }

    public void consultarSaldo(int numero) {
        ContaBancaria conta = buscarConta(numero);
        if (conta != null) {
            conta.exibirSaldo();
        } else {
            System.out.println("Conta número " + numero + " não encontrada.");
        }
    }

    public void verExtrato(int numero) {
        ContaBancaria conta = buscarConta(numero);
        if (conta != null) {
            conta.exibirExtrato();
        } else {
            System.out.println("Conta número " + numero + " não encontrada.");
        }
    }

    public void aplicarRendimento(int numero, double percentual) {
        ContaBancaria conta = buscarConta(numero);
        if (conta != null) {
            conta.aplicarRendimento(percentual);
        } else {
            System.out.println("Conta número " + numero + " não encontrada.");
        }
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada no banco.");
            return;
        }
        System.out.println("--- Contas Abertas no Banco ---");
        for (ContaBancaria conta : contas) {
            conta.exibirSaldo();
        }
    }
}
