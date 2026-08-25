package Atividade7;

import java.util.ArrayList;

public class ContaBancaria {
    private int numero;
    private Titular titular;
    private double saldo;
    private ArrayList<String> movimentacoes = new ArrayList<>();

    public ContaBancaria(int numero, Titular titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.movimentacoes.add("Abertura de conta - Saldo inicial: R$ " + saldoInicial);
    }

    public int getNumero() {
        return this.numero;
    }

    public Titular getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return false;
        }
        saldo += valor;
        movimentacoes.add("Depósito: R$ " + valor);
        System.out.println("Depósito efetuado com sucesso!");
        return true;
    }

    public boolean sacar(double valor) {
        double custo = valor + 0.50;
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (custo > saldo) {
            System.out.println("Saldo insuficiente na conta " + numero + " (" + titular.getNome() + "). Saldo atual: R$ " + saldo);
            return false;
        }
        saldo -= custo;
        movimentacoes.add("Saque: R$ " + valor + " (Tarifa: R$ 0.50)");
        System.out.println("Saque efetuado com sucesso!");
        return true;
    }

    public void aplicarRendimento(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual inválido: " + percentual);
            return;
        }
        double rendimento = saldo * (percentual / 100);
        saldo += rendimento;
        movimentacoes.add("Rendimento (" + percentual + "%): R$ " + rendimento);
        System.out.println("Rendimento aplicado com sucesso!");
    }

    public void exibirExtrato() {
        System.out.println("--- Extrato da Conta " + numero + " - Titular: " + titular.getNome() + " ---");
        for (String m : movimentacoes) {
            System.out.println("- " + m);
        }
        System.out.println("Saldo Atual: R$ " + saldo);
    }

    public void exibirSaldo() {
        System.out.println("Conta " + numero + " | Titular: " + titular.getNome() + " | Saldo: R$ " + saldo);
    }
}
