package modelo;

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
    
        @Override
    public String getInformacoes(){
        return  nome + " | Cpf: " + cpf + " | Idade: " + calcularIdade() + " anos " +
                " | Cidade: "+ endereco.getCidade() + "| Rua : " + endereco.getRua() + ", " + endereco.getNumero() +
                " | RA: " + RA;
    }
    @Override
    public void exibirInformacoes(){
        System.out.println(getInformacoes());
    }
}
