package Pessoas;

import Endereco.Endereco;
import java.time.LocalDate;

public class Aluno extends Pessoa {
    protected String RA;

    public Aluno() {
    }

    public Aluno(String RA, String nome, String cpf, LocalDate dataNascimento, String email, Endereco endereco) {
        super(nome, cpf, dataNascimento, email, endereco);
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
}
