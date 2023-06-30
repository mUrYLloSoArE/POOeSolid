package model;

public class Candidatos {

    private String nome;
    private String matricula;
    private double nota;


    public Candidatos() {

    }

    public Candidatos(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public String imprimir() {
        return "Candidato: " +
                "nome = " + nome  +
                ", matricula = " + matricula  +
                ", nota = " + nota
                ;
    }
}
