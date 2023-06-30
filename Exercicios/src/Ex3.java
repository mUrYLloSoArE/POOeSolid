import model.Restaurante;
import services.RestauranteService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RestauranteService service= new RestauranteService();


        int opcao=0;
        int qtd=0;
        String nome;
        List<String> ingredientes = new ArrayList<>();
        Restaurante pratos;

        do {
            service.menu();
            opcao= sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Programa Encerrado! ");
                    break;
                case 1:
                    System.out.println("Digite o nome do prato: ");
                    nome=sc.next();
                    System.out.println("Digite a quantidade de ingredientes: ");
                    qtd=sc.nextInt();
                    for (int i = 0; i <qtd; i++) {
                        System.out.println("Digite o " + (i+1) + " ingrediente: ");
                        ingredientes.add(sc.next());
                    }

                    pratos = new Restaurante(nome, ingredientes);
                    service.adicionar(pratos);


                    break;
                case 2:
                    System.out.println("Cardápio : ");
                    service.listar();
                    break;
                case 3:
                    System.out.println("Digite o nome do Prato: ");
                    nome=sc.next();
                    if (! (service.getListaPratos().isEmpty())){
                        if (service.remover(nome)){
                            System.out.println("Pedido removido");
                        }else {
                            System.out.println("");
                        }
                    }else {
                        System.out.println("Candidato inexistente. ");
                    }
                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }
        }while (opcao !=0);

        sc.close();

    }
}
