import model.Produtos;
import services.ProdutoService;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        int opcao=0;
        double preco;
        String nome;
        Produtos produtos;

        do {
            service.menu();
            opcao= sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Programa Encerrado! ");
                    break;
                case 1:

                    System.out.println("Adicionando o produto ao carrinho: ");
                    System.out.println("Digite o nome do produto: ");
                    nome=sc.next();
                    System.out.println("Digite o preço do produto: ");
                    preco= sc.nextDouble();

                    produtos = new Produtos(nome,preco);
                    service.adicionar(produtos);

                    break;
                case 2:
                    System.out.println("Lista dos Produtos : ");
                    service.listar();
                    break;
                case 3:
                    System.out.println("Removendo o produto ao carrinho: ");
                    System.out.println("Digite o nome do produto: ");
                    nome=sc.next();
                    if (! (service.getListaProdutos().isEmpty())){
                        if (service.remover(nome)){
                            System.out.println("Produto removido com sucesso! ");
                        }else {
                            System.out.println("");
                        }
                    }else {
                        System.out.println("Produtos inexistentes no carrinho. ");
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