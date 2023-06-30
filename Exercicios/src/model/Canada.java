package model;

public class Canada {

    private String codIso,nome;
    private int poupulacao;
    private double dimensao;
    private Fronteira fronteira;

    public Canada() {

    }

    public Canada(String codIso, String nome, double dimensao, Fronteira fronteira) {
        this.codIso = codIso;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteira = fronteira;
    }

    public Canada(String codIso, String nome, double dimensao) {
        this.codIso = codIso;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getCodIso() {
        return codIso;
    }

    public String getNome() {
        return nome;
    }

    public int getPoupulacao() {
        return poupulacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setCodIso(String codIso) {
        this.codIso = codIso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public void setPoupulacao(int poupulacao) {
        this.poupulacao = poupulacao;
    }

    public Fronteira getFronteira() {
        return fronteira;
    }

    public void vizinho() {

    }
    public void densidade(){
        double calc=getPoupulacao()/getDimensao();
        System.out.println("Densidade populacional : ");
        System.out.println(Math.round(calc) + "Km por habitante");
    }

}
