package atividade3;

public class Principal {
    public static void main(String[] strg) {

        Titular titular1 = new Titular("", "04738637070","19/12/1995");

        Banco b1 = new Banco(titular1, -100);

        Titular titular2 = new Titular("Daniel Crimes Ciberneticos", "12345678900","18/09/2006");

        Banco b2 = new Banco(titular2, 1000);

        b1.Exibir();
        b2.Exibir();

        b1.sacar(10);
        b2.depositar(100);

        b1.aplicarRendimento(20);
        b2.aplicarRendimento(20);

        b1.Exibir();
        b2.Exibir();
    }
}
