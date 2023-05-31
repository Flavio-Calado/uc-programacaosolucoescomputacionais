package Aula8;

public class Aluno {
    
    private String nome;
    private int RA;
    private String curso;
    private double notaFinal;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int rA) {
        this.RA = rA;
    }

}
