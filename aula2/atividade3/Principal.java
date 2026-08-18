package Atividade6;

public class Principal {
    public static void main(String[] strg){
        Autor a1 = new Autor("Elton","EUA");
        Livro l1 = new Livro("Rendição",a1,2006);
        Livro l2 = new Livro("Senhor dos aneis",a1,2009);

        Autor a2 = new Autor("Edson maldade","Brazuca");
        Livro l3 = new Livro("Maldade sem limites",a2,2011);

        l1.ExibirFicha();
        l2.ExibirFicha();
        l3.ExibirFicha();

        l1.Emprestar();
        l1.Emprestar();

        l1.Disponivel();
        l2.Disponivel();
        l3.Disponivel();

        l1.Devolver();

        l1.Disponivel();
        l2.Disponivel();
        l3.Disponivel();

    }

}
