package Curso;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int semestre;

    public Disciplina() {
    }

    public Disciplina(String nome, int cargaHoraria, int semestre) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
}
