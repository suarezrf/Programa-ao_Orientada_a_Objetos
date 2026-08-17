
package atividade1;

public class principal {
    public static void main(String[] strg){
        produtos p1 = new produtos();
        p1.valor = 10.00;
        p1.nome = "2KG Arroz";
        p1.estoque = 1;

        produtos p2 = new produtos();
        p2.valor = 9.00;
        p2.nome = "1L Azeite";
        p2.estoque = 12;

        produtos p3 = new produtos();
        p3.valor = 7.00;
        p3.nome = "1L Leite";
        p3.estoque = 24;

        System.out.println("=-=-=-=- Antes da venda =-=-=-=-=-");
        p1.apresentar();
        p2.apresentar();
        p3.apresentar();


        System.out.println("=-=-=-=-- Depois da venda =--=--=-=-");
        p1.vender(2);

        p1.apresentar();
        p2.apresentar();
        p3.apresentar();

    }
}
