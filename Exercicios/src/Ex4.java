import model.Canada;
import model.Fronteira;

public class Ex4 {
    public static void main(String[] args) {

        Fronteira usa= new Fronteira("USA","Estados Unidos da América ",9834000);
        Canada canada = new Canada("CAN","Canadá",9985000,usa);

        usa.setPoupulacao(33190000);
        System.out.println();
        System.out.println("Informações do Estados Unidos: ");
        System.out.println("Código ISO-> " + usa.getCodIso());
        System.out.println("Nome do páis -> " + usa.getNome());
        System.out.println("Dimensão -> " + usa.getDimensao());
        System.out.println("População -> " + usa.getPoupulacao());
        usa.vizinho();
        usa.densidade();


        canada.setPoupulacao(38250000);
        System.out.println();
        System.out.println("Informações do Canadá: ");
        System.out.println("Código ISO-> " + canada.getCodIso());
        System.out.println("Nome do páis -> " + canada.getNome());
        System.out.println("Dimensão -> " + canada.getDimensao());
        System.out.println("População -> " + canada.getPoupulacao());
        canada.densidade();

        System.out.println();
        System.out.println("Seu país vizinho: ");
        System.out.println("Código ISO-> " + canada.getFronteira().getCodIso());
        System.out.println("Nome do páis -> " + canada.getFronteira().getNome());
        System.out.println("Dimensão -> " + canada.getFronteira().getDimensao());
        System.out.println("População -> " + canada.getFronteira().getPoupulacao());

    }
}
