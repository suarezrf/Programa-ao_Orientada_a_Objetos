package atividade3;

public class Banco {
    Titular titular;
    double saldo;
    int operacao;

    Banco(Titular titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.operacao = 0;
    }

    void Exibir() {
        System.out.println("=-=-=-=-=- Banco =-=-=-=-=-=");
        System.out.println("- Titular: " + titular.nome);
        System.out.println("- CPF: " + titular.cpf);
        System.out.println("- Saldo: " + saldo);
        System.out.println("- Operações: " + operacao);
        System.out.println("- Data de Nascimento: "+ titular.dataNasc);
        System.out.println("----------------------------");
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Deposito invalido!");
        } else {
            saldo += valor;
            operacao += 1;
        }
    }

    void sacar(double valor) {
        if (saldo < valor + 0.50) {
            System.out.println("Saque invalido!");
        } else {
            saldo -= valor + 0.50;
            operacao += 1;
        }
    }

    void aplicarRendimento(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            percentual = percentual / 100;
            saldo = saldo * percentual + saldo;
        } else {
            System.out.println("Percentual Invalido!");
        }
    }
}
