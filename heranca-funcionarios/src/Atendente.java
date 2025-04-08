import java.util.Scanner;

public class Atendente extends Funcionario {

    Scanner scanner = new Scanner(System.in);

    public double valorCaixa = 0.0;
	public double valorPagamento;

    public Atendente(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, administrador);
    }

	public void receberPagamento(){
	 	System.out.println("Digite o valor do pagamento.");
		valorPagamento = scanner.nextDouble();
 		valorCaixa += valorPagamento;
        System.out.println("O valor atual no caixa é " + valorCaixa);
	}
	
	public void fecharCaixa(){
	 	System.out.println("Fechando o caixa.");
	}

   @Override
    public String realizarLogin() {
        return super.realizarLogin() + "\nPerfil Atendente.";
    }

    @Override
    public String realizarLogoff() {
        return super.realizarLogoff() + "\nPerfil Atendente.";
    }

    @Override
    public String alterarDados() {
        return super.alterarDados() + "\nPerfil Atendente.";
    }

    @Override
    public String alterarSenha() {
        return super.alterarSenha() + "\nPerfil Atendente.";
    }

}
