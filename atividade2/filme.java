
package atividade2;

public class filme {
    String Titulo;
    int duracao;
    double nota;
    boolean assistido;

    void Exibir(){
        System.out.println("=--=-=-=-=-= Filme =-=-=-=-=-=" );
        System.out.println("Titulo: " +Titulo );
        System.out.println("Duraçao do filme: " +duracao+ "h" );
        System.out.println("Nota: " + nota );
        System.out.println("Assistido: " + assistido );
    }
    void marcarassistido(){
        assistido = true;
    }

    void trocarnota(double novaNota){
        if (nota >= 0 && nota <=10 ) {
            nota = novaNota;
            System.out.println("Nota Válida!");

        }else {
            System.out.println("Nota Inválida!");
        }
    }
}
