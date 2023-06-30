package model;

public class Fronteira extends Canada{
    public Fronteira(String codIso, String nome, double dimensao) {
        super(codIso, nome, dimensao);
    }

    public Fronteira() {

    }

    @Override
    public void setCodIso(String codIso) {
        super.setCodIso(codIso);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setDimensao(double dimensao) {
        super.setDimensao(dimensao);
    }

    @Override
    public void setPoupulacao(int poupulacao) {
        super.setPoupulacao(poupulacao);
    }

    public void vizinho(){
        if (getDimensao()==9834000){
            System.out.println("É país vizinho do Canadá");
        }else {
            System.out.println("Não faz fronteira com o Canadá ");
        }
    }

    @Override
    public void densidade(){
        double calc=getPoupulacao()/getDimensao();
        System.out.println("Densidade populacional : ");
        System.out.println(Math.round(calc) + "Km por habitante");
    }

}
