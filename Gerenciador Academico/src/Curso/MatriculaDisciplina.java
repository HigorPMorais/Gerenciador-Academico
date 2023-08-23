package Curso;

import Pessoas.Aluno;

public class MatriculaDisciplina {
    private int ano;
    private int semestre;
    private double mediaFinal;
    private int PercentualFrequencia;
    private String situacao;
    private Aluno aluno;
    private Disciplina disciplina;

    public MatriculaDisciplina() {
        aluno = new Aluno();
        disciplina = new Disciplina();
    }

    public MatriculaDisciplina(int ano, int semestre, double mediaFinal, int PercentualFrequencia, String situacao, Aluno aluno, Disciplina disciplina) {
        this.ano = ano;
        this.semestre = semestre;
        this.mediaFinal = mediaFinal;
        this.PercentualFrequencia = PercentualFrequencia;
        this.situacao = situacao;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public int getPercentualFrequencia() {
        return PercentualFrequencia;
    }

    public void setPercentualFrequencia(int PercentualFrequencia) {
        this.PercentualFrequencia = PercentualFrequencia;
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
}
