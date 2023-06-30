package model;

import java.util.List;

public class Restaurante {

  private String nome;
  private List<String> ingredientes;
    public Restaurante() {
    }

    public Restaurante(String nome, List<String> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }


    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String getNome() {
        return nome;
    }



    public String imprimir() {
                 return "Prato -> " + getNome() + "\n"+
                "Ingredientes -> " + getIngredientes();
    }
}
