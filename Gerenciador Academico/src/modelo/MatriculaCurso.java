package modelo;

import modelo.Aluno;
import java.time.LocalDate;

public class MatriculaCurso {
    private int ano;
    private LocalDate dataMatricula;
    private String situacao;
    private Aluno aluno;
    private Curso curso;

    public MatriculaCurso() {
        aluno = new Aluno();
        curso = new Curso();
    }

    public MatriculaCurso(int ano, LocalDate dataMatricula, String situacao, Aluno aluno, Curso curso) {
        this.ano = ano;
        this.dataMatricula = dataMatricula;
        this.situacao = situacao;
        this.aluno = aluno;
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    
}
