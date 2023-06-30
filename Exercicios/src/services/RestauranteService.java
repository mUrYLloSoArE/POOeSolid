package services;
import model.Restaurante;
import java.util.ArrayList;

public class RestauranteService {

    private ArrayList<Restaurante> listaPratos = new ArrayList();

    public  ArrayList<Restaurante> getListaPratos(){
        return listaPratos;
    }

    public  void  adicionar(Restaurante r){
        listaPratos.add(r);
        System.out.println("Prato adicionado! ");
    }
    public void listar(){

        for (Restaurante r: listaPratos
        ) {
            System.out.println(r.imprimir());
        }
    }

    public boolean remover(String nome){
        for (Restaurante r:listaPratos) {
            if (r.getNome().equalsIgnoreCase(nome)) {
                listaPratos.remove(r);
                return  true;
            }
        }
        return false;
    }

    public void menu(){
        System.out.println("Cardápio virtual : ");
        System.out.println("1 -> Faça seu pedido ");
        System.out.println("2 -> Listar pedidos ");
        System.out.println("3 -> Excluir pedido ");
        System.out.println("0 -> Sair");
    }
}
