
package atividade3;

public class banco {
    String Titular;
    double saldo;

    void Exibir(){
        System.out.println("=-=-=-=-=- Banco =-=-=-=-=-=");
        System.out.println("- Titular: "+Titular );
        System.out.println("- Saldo: "+saldo );
        System.out.println("----------------------------");

    }
    void depositar(double valor){
        saldo += valor;
    }
    void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saque invalido!");
    } else {
        saldo -= valor;
        }
    }

}
