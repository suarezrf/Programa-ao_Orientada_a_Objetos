package Atividade4;

public class principal {
    public static void main(String[] strg){
        produto produto1 = new produto("melancia", 10.00);
        cliente cliente1 = new cliente("Kleiton", "kleiton@gmail.com");
        pedido pedido1 =  new pedido(cliente1, produto1,10);

        produto produto2 = new produto("Gilete 3 em 1", 20.00);
        cliente cliente2 = new cliente("Jackson", "jackson@gmail.com");
        pedido pedido2 =  new pedido(cliente2, produto2,11);

        pedido1.resumo();
        System.out.println("Email:"+ cliente1.email);
        pedido2.resumo();
        System.out.println("Email:"+ cliente2.email);

    }
}
