public abstract class Funcionario {

    protected String nome;
	protected String email;
	protected String senha;
	protected boolean administrador;
	protected int quantidadeVendas;

	public Funcionario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }


    public String realizarLogin(){
        return "Realizando login do funcionário " + nome;
    }

	public String realizarLogoff(){
        return "Realizando logoff do funcionário " + nome;
    }

	public String alterarDados(){
        return "Aterando os dados do funcionário " + nome;
    }

	public String alterarSenha(){
        return "Alterando a senha do funcionário " + nome;
    }

    public void receberPagamento(){
    }
    

    public void fecharCaixa(){
    }

    public int getQuantidadeVendas() {
        return this.quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public void realizarVenda(){
    }

    public void consultarVendas(){
    }
    
    public void gerarRelatório(){
    }
}
