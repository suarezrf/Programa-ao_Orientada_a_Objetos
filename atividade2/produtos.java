
package atividade2;

public class Principal {
    public static void main(String[] strg){
       filme f1 = new filme();
       f1.Titulo = "Espetacular Homem Aranha";
       f1.duracao = 2;
       f1.nota = 9;
       f1.assistido = false;

        filme f2 = new filme();
        f2.Titulo = "Senhor dos anéis";
        f2.duracao = 2;
        f2.nota = 10;
        f2.assistido = false;

        filme f3 = new filme();
        f3.Titulo = "Lobo de wallstreet";
        f3.duracao = 3;
        f3.nota = 8;
        f3.assistido = false;

        f1.Exibir();
        f2.Exibir();
        f3.Exibir();

        f1.marcarassistido();
        f3.trocarnota(9.5);
        System.out.println("=-=-=- Depois de Assistir e trocar a Nota =-==-=-=");
        f1.Exibir();
        f3.Exibir();
    }
}
