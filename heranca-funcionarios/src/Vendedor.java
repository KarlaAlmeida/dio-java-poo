

public class Vendedor extends Funcionario {

    public Vendedor(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, administrador);
    }
    

	public void realizarVenda(){
	 	System.out.println("Venda realizada.");
		quantidadeVendas ++;      
	}

	public void consultarVendas(){
		System.out.println("A quantidade de vendas realizadas é " + getQuantidadeVendas());
	}

	@Override
    public String realizarLogin() {
        return super.realizarLogin() + "\nPerfil Vendedor.";
    }

    @Override
    public String realizarLogoff() {
        return super.realizarLogoff() + "\nPerfil Vendedor.";
    }

    @Override
    public String alterarDados() {
        return super.alterarDados() + "\nPerfil Vendedor.";
    }

    @Override
    public String alterarSenha() {
        return super.alterarSenha() + "\nPerfil Vendedor.";
    }
}
