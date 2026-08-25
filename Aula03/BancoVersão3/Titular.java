package Atividade7;

public class Titular {
    private String nome;
    private String cpf;
    private String dataNasc;

    public Titular(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.isEmpty()) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        if (dataNasc != null && !dataNasc.isEmpty()) {
            this.dataNasc = dataNasc;
        } else {
            System.out.println("Data de nascimento inválida.");
        }
    }
}
