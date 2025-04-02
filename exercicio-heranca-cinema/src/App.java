import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        var option1 = -1;
	
	    do{
            System.out.println("===Escolha o tipo de ingresso:==="); 
            System.out.println("1 - Ingresso individual."); 
            System.out.println("2 - Ingresso meia."); 
            System.out.println("3 - Ingresso família."); 
            System.out.println("0 - Sair.");

            option1 = scanner.nextInt();

            switch (option1){
                case 1 -> {
                    Ingresso ingressoIndividual = new Ingresso();  
                    ingressoIndividual.setValor(30);      
                    System.out.println(ingressoIndividual.getValorReal());
                }
                case 2 -> {
                    Ingresso ingressoMeia = new IngressoMeia();  
                    ingressoMeia.setValor(30);      
                    System.out.println(ingressoMeia.getValorReal());
                }
                case 3 -> {
                    Ingresso ingressoFamilia = new IngressoFamilia();
                    ingressoFamilia.setValor(30);
                    System.out.println(ingressoFamilia.getValorReal());
                }
                case 0 -> {
                    System.out.println("Saindo.");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida.");                          
           }
        } while (option1 != 0);
    }
}
