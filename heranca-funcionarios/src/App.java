import java.util.Scanner;

public class App {
    
    private final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {

        Funcionario gerente = new Gerente("Karla", "karlacrika@gmail.com", "123456", true);
        Funcionario atendente = new Atendente("Karla", "karlacrika@gmail.com", "123456", false);
        Funcionario vendedor = new Vendedor("Karla", "karlacrika@gmail.com", "123456", false);
      
        var option1 = -1;
        var option2 = -1;
        var option3 = -1;
        var option4 = -1;
	
	    do{
            System.out.println("===Escolha o perfil do funcionário:==="); 
            System.out.println("1 - Atendente."); 
            System.out.println("2 - Vendedor."); 
            System.out.println("3 - Gerente."); 
            System.out.println("0 - Sair do programa.");

            option1 = scanner.nextInt();

            String retornoAcao = null;

            switch (option1){
                case 1 -> {

                    System.out.println("Nome: " + atendente.getNome() + "\nLogin: " + atendente.getEmail() + "\nSenha: " + atendente.getSenha() + "\nAdministrador: " + atendente.isAdministrador());

                    do{
                        System.out.println("===Escolha qual ação a fazer:==="); 
                        System.out.println("1 - Receber pagamento."); 
                        System.out.println("2 - Fechar o caixa."); 
                        System.out.println("3 - Realizar login."); 
                        System.out.println("4 - Realizar logoff."); 
                        System.out.println("5 - Alterar dados."); 
                        System.out.println("6 - Alterar senha."); 
                        System.out.println("9 - Voltar ao menu anterior.");
                        
                        option2 = scanner.nextInt();
            
                        switch (option2){
                            case 1 -> atendente.receberPagamento();
                            case 2 -> atendente.fecharCaixa();
                            case 3 -> retornoAcao = atendente.realizarLogin();
                            case 4 -> retornoAcao = atendente.realizarLogoff();
                            case 5 -> retornoAcao = atendente.alterarDados();
                            case 6 -> retornoAcao = atendente.alterarSenha();
                            case 9 -> System.out.println("Voltando menu anterior.");
                            default -> System.out.println("Opção inválida.");                          
                       }
                       System.out.println(retornoAcao);

                    } while (option2 != 9);


                }
                case 2 -> {

                    System.out.println("Nome: " + vendedor.getNome() + "\nLogin: " + vendedor.getEmail() + "\nSenha: " + vendedor.getSenha() + "\nAdministrador: " + vendedor.isAdministrador());

                    do{
                        System.out.println("===Escolha qual ação a fazer:==="); 
                        System.out.println("1 - Realizar venda."); 
                        System.out.println("2 - Consultar venda."); 
                        System.out.println("3 - Realizar login."); 
                        System.out.println("4 - Realizar logoff."); 
                        System.out.println("5 - Alterar dados."); 
                        System.out.println("6 - Alterar senha."); 
                        System.out.println("9 - Voltar ao menu anterior.");
            
                        option3 = scanner.nextInt();
            
                        switch (option3){
                            case 1 -> vendedor.realizarVenda();
                            case 2 -> vendedor.consultarVendas();
                            case 3 -> retornoAcao = vendedor.realizarLogin();
                            case 4 -> retornoAcao = vendedor.realizarLogoff();
                            case 5 -> retornoAcao = vendedor.alterarDados();
                            case 6 -> retornoAcao = vendedor.alterarSenha();
                            case 9 -> System.out.println("Voltando menu anterior.");
                            default -> System.out.println("Opção inválida.");                          
                       }
                       System.out.println(retornoAcao);

                    } while (option3 != 9);
                    
                }
                case 3 -> {

                    System.out.println("Nome: " + gerente.getNome() + "\nLogin: " + gerente.getEmail() + "\nSenha: " + gerente.getSenha() + "\nAdministrador: " + gerente.isAdministrador());

                    do{
                        System.out.println("===Escolha qual ação a fazer:==="); 
                        System.out.println("1 - Gerar relatório."); 
                        System.out.println("2 - Consultar venda."); 
                        System.out.println("3 - Realizar login."); 
                        System.out.println("4 - Realizar logoff."); 
                        System.out.println("5 - Alterar dados."); 
                        System.out.println("6 - Alterar senha."); 
                        System.out.println("9 - Voltar ao menu anterior.");

                        option4 = scanner.nextInt();
            
                        switch (option4){
                            case 1 -> gerente.gerarRelatório();
                            case 2 -> gerente.consultarVendas();
                            case 3 -> retornoAcao = gerente.realizarLogin();
                            case 4 -> retornoAcao = gerente.realizarLogoff();
                            case 5 -> retornoAcao = gerente.alterarDados();
                            case 6 -> retornoAcao = gerente.alterarSenha();
                            case 9 -> System.out.println("Voltando menu anterior.");
  
                            default -> System.out.println("Opção inválida.");                          
                       }
                       System.out.println(retornoAcao);

                    } while (option4 != 9);
                }
                case 0 -> {
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida.");                          
           }
        } while (option1 != 0);
    }

}
