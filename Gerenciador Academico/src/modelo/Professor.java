package modelo;

import java.time.LocalDate;

public class Professor extends Funcionario{
    protected String formacao;

    public Professor() {
    }

    public Professor(String formacao, String ctps, double salario, String cargo, String nome, String cpf, LocalDate dataNascimento, String email, Endereco endereco) {
        super(ctps, salario, cargo, nome, cpf, dataNascimento, email, endereco);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    @Override
    public String getInformacoes(){
        return  nome + " | Cpf: " + cpf + " | Idade: " + calcularIdade() + " anos " +
            " | Cidade: "+ endereco.getCidade() + "| Rua : " + endereco.getRua() + ", " + endereco.getNumero() + 
            " | Ctps: " + ctps + " | Salario: " + salario + " | Cargo: " + cargo + " | Formacao: ";
    }
    @Override
    public void exibirInformacoes(){
        System.out.println(getInformacoes());
    }
}
