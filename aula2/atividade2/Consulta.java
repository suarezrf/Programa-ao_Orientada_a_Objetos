package Atividade5;

import java.time.LocalDate;

public class Consulta {
    Paciente paciente;
    LocalDate data;
    double valor;


    Consulta(Paciente paciente, LocalDate data){
        this.paciente = paciente;
        this.data = data;
        this.valor = 67;

    }
    void remarcar(LocalDate novaData) {
        this.data = novaData;
        System.out.println("- Data Remarcada: "+ novaData +"   - Paciente:"+ paciente.nome);

    }
    void comprovante(){
        System.out.println("- Paciente: "+ paciente.nome + "  - Valor da Consulta: "+ valor +"  - Data da Consulta: "+ data);

    }



}
