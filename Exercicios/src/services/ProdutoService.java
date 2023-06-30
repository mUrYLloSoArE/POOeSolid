package services;

import model.Produtos;

import java.util.ArrayList;

public class ProdutoService {

    private ArrayList<Produtos> listaProdutos = new ArrayList();

    public  ArrayList<Produtos> getListaProdutos(){
        return listaProdutos;
    }

    public  void  adicionar(Produtos p){
        listaProdutos.add(p);
    }

    public void listar(){
        int i=0;
        for (Produtos p: listaProdutos
             ) {
            System.out.println("Produto nº " + (i+1));
            System.out.println(p.imprimir());
        }
    }

    public boolean remover(String nome){
        for (Produtos p:listaProdutos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                listaProdutos.remove(p);
                return  true;
            }
        }
        return false;
    }

    public void menu(){
        System.out.println("Carrinho de Produtos, escolha uma das opções a seguir: ");
        System.out.println("1 -> Cadastrar ");
        System.out.println("2 -> Listar");
        System.out.println("3 -> Excluir");
        System.out.println("0 -> Sair");
    }

}
