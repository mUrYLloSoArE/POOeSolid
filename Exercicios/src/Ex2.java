import model.Candidatos;
import services.CandidatoService;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CandidatoService service= new CandidatoService();

        int opcao=0;
        double nota;
        String nome,matricula;
        Candidatos candidatos;

        do {
            service.menu();
            opcao= sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Programa Encerrado! ");
                    break;
                case 1:
                    System.out.println("Digite o nome do candidato: ");
                    nome=sc.next();
                    System.out.println("Digite a matricula do candidato: ");
                    matricula=sc.next();
                    System.out.println("Digite a nota do candidato: ");
                    nota= sc.nextDouble();

                    candidatos = new Candidatos(nome,matricula,nota);
                    service.adicionar(candidatos);

                    break;
                case 2:
                    System.out.println("Lista dos Candidatos : ");
                    service.listar();
                    break;
                case 3:
                    System.out.println("Digite a matricula do vestibulando: ");
                    matricula=sc.next();
                    if (! (service.getListaProdutos().isEmpty())){
                        if (service.remover(matricula)){
                            System.out.println("Candidato de matricula " + matricula + " está fora da lista");
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
