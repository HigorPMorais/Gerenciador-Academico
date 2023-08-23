package modelo;

import java.time.LocalDate;

public class FuncionarioTerceirizado extends Funcionario{
    private String empresaTerceirizada;

    public FuncionarioTerceirizado() {
    }

    public FuncionarioTerceirizado(String empresaTerceirizada, String ctps, double salario, String cargo, String nome, String cpf, LocalDate dataNascimento, String email, Endereco endereco) {
        super(ctps, salario, cargo, nome, cpf, dataNascimento, email, endereco);
        this.empresaTerceirizada = empresaTerceirizada;
    }

    public String getEmpresaTerceirizada() {
        return empresaTerceirizada;
    }

    public void setEmpresaTerceirizada(String empresaTerceirizada) {
        this.empresaTerceirizada = empresaTerceirizada;
    }
    
        @Override
    public String getInformacoes(){
        return  nome + " | Cpf: " + cpf + " | Idade: " + calcularIdade() + " anos " +
            " | Cidade: "+ endereco.getCidade() + "| Rua : " + endereco.getRua() + ", " + endereco.getNumero() + 
            " | Ctps: " + ctps + " | Salario: " + salario + " | Cargo: " + cargo + " | Empresa Terceirizada: " + empresaTerceirizada;
    }
    @Override
    public void exibirInformacoes(){
        System.out.println(getInformacoes());
    }
}
