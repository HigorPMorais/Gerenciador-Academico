package controle;

import modelo.Aluno;
import modelo.Curso;
import util.Input;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import modelo.Pessoa;

import util.DialogBoxUtils;

public class CadastroAluno extends CadastroPessoa{
    
    private MatriculaCurso cadCurso;

    public CadastroAluno(MatriculaCurso cadCurso) {
        this.cadCurso = cadCurso;
    }

    public MatriculaCurso getCadCurso() {
        return cadCurso;
    }
    
    public void menuAluno() {
        super.menuControlePessoa("Aluno");
    }

    public void setarDados(Aluno aluno) {
        super.setarDados(aluno);
        System.out.print("RA: ");
        aluno.setRA(Input.nextLine());
    }
    
    @Override
    public void cadastrar() {
        try {
            Aluno al = new Aluno();
            setarDados(al);
            listaPessoas.add(al);
            DialogBoxUtils.exibirMensagem("Cadastro realizado", "O cadastro realizado com sucesso!");
        } catch (Exception e) {
            DialogBoxUtils.exibirMensagemDeErro("Falha no cadastro", "Erro! falha ao cadastrar dados!\n" + e.getMessage());
        }
    }

    @Override
   public void listar() {
        listar(listaDePessoaAlunos(), "Alunos", true);
    }

    public List<Pessoa> listaDePessoaAlunos() {
        return listaPessoas.stream().filter(e -> e.getClass() == Aluno.class).collect(Collectors.toList());
    }
    
    public List<Aluno> listaDeAlunos() {
        return listaPessoas.stream().filter(e -> e.getClass() == Aluno.class).map(a -> (Aluno) a).collect(Collectors.toList());
    }
}
