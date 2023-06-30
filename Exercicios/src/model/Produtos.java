package model;

public class Produtos {

  private String nome;
  private double preco;


    public Produtos() {

    }
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }


    public String imprimir() {
        return "Produto:" +
                "nome = '" + nome + '\'' +
                ", preco = " + preco
                ;
    }
}
