package Pessoas;

import Endereco.Endereco;
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
}
