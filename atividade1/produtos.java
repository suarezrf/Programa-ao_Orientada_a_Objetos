
package atividade1;

public class produtos {
    Double valor;
    String nome;
    int estoque;

    void apresentar(){
        System.out.println("Produto: "+ nome + " Preço: "+ valor + " Estoque: " + estoque);
    }
    void vender(int qtd) {
        if (qtd > estoque){
            System.out.println("- Infelizmente o nosso estoque acabou");
        }
        else{
            estoque = estoque - qtd;
        }
    }
}
