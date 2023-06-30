package services;



import model.Candidatos;

import java.util.ArrayList;

public class CandidatoService {

    private ArrayList<Candidatos> listaCandidatos = new ArrayList();

    public  ArrayList<Candidatos> getListaProdutos(){
        return listaCandidatos;
    }

    public  void  adicionar(Candidatos c){
        listaCandidatos.add(c);
        System.out.println("Candidato cadastrado com sucesso! ");
    }

    public void listar(){
        int i=0;
        for (Candidatos c: listaCandidatos
        ) {
            System.out.println("Candidato nº " + (i+1));
            System.out.println(c.imprimir());
        }
    }

    public boolean remover(String matricula){
        for (Candidatos c:listaCandidatos) {
            if (c.getMatricula().equalsIgnoreCase(matricula)) {
                listaCandidatos.remove(c);
                return  true;
            }
        }
        return false;
    }


    public void menu(){
        System.out.println("Painel dos Candidatos : ");
        System.out.println("1 -> Cadastrar ");
        System.out.println("2 -> Listar");
        System.out.println("3 -> Excluir");
        System.out.println("0 -> Sair");
    }

}
