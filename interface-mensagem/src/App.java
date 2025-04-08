import java.util.Scanner;

public class App {
    
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        var option1 = -1;

        MensagemMarketing mensagemRecebida = null;
	
	    do{
            System.out.println("===Escolha o serviço de recebimento de mensagem:==="); 
            System.out.println("1 - SMS."); 
            System.out.println("2 - E-mail."); 
            System.out.println("3 - Redes Sociais.");
	        System.out.println("4 - Whatsapp."); 
            System.out.println("0 - Sair do programa.");

            option1 = scanner.nextInt();

            switch (option1){
                case 1 -> mensagemRecebida = sentSMS();
                //case 2 -> 
                //case 3 -> 
	            //case 4 -> 
                case 0 -> {
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opção inválida.");
                    continue;
                }
            }

            System.out.println(mensagemRecebida.getMensagemMarketing());

        }while (option1 != 0);
        
    }

    private static MensagemMarketing sentSMS(){
        //String mensagem;
        System.out.println("Escreva a mensagem a ser enviada.");
        var mensagem = scanner.nextInt();
        return new SMS(mensagem);
    }
}
