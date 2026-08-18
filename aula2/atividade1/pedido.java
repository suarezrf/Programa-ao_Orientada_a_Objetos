package Atividade4;

public class pedido {
    cliente cliente;
    produto produto;
    int quantidade;

    pedido(cliente cliente,produto produto, int quantidade){
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    void resumo(){
        System.out.println("- Cliente: "+ cliente.nome +" - Produto: "+ produto.nome +" - Valor Total: "+ produto.preco * quantidade);
    }
}
