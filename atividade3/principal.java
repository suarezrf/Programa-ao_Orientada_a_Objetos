
package atividade3;

public class principal {
    public static void main(String[] strg) {
        banco b1 = new banco();
        b1.Titular = "Carlos Titular";
        b1.saldo = 100;

        banco b2 = new banco();
        b2.Titular = "Daniel Crimes Ciberneticos";
        b2.saldo = 1000;

        b1.Exibir();
        b2.Exibir();

        b1.sacar(10);
        b2.depositar(100);

        b1.Exibir();
        b2.Exibir();

    }
}
