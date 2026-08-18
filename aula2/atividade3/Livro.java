package Atividade6;

public class Livro {
    String titulo;
    Autor autor;
    int ano;
    boolean emprestado;

    Livro(String titulo,Autor autor,int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;

    }
    void ExibirFicha(){
        System.out.println("> Titulo:"+ titulo + " > Nome do Autor:"+ autor.nome+ " > Ano:"+ano);
    }
    void Disponivel() {
        if (emprestado == false) {
            System.out.println("-=-=-=- Livros Disponivel =-=-=-= ");
            System.out.println("> Titulo: " + titulo);
            System.out.println("> Autor: " + autor.nome);
        }
        if (emprestado == true) {
            System.out.println("-=-=-=- Livros Indisponivel =-=-=-= ");
            System.out.println("> Titulo: " + titulo);
            System.out.println("> Autor: " + autor.nome);
        }

    }
    void Emprestar(){
        if (emprestado == false){
            emprestado = true;
            System.out.println("- Livro Emprestado com sucesso");
        }else{
            System.out.println("- Erro Livro já foi emprestado!");
        }
    }
    void Devolver(){
        if (emprestado == true){
            emprestado = false;
            System.out.println("- Livro Devolvido com sucesso");
        }else{
            System.out.println("- Erro!");
        }
    }
}
