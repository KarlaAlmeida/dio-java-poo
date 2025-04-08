public class Gerente extends Funcionario {

    public Gerente(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, administrador);
    }

    public void gerarRelatório(){
        System.out.println("Relatório gerado.");
    }

    public void consultarVendas(){
        System.out.println("A quantidade de vendas realizadas é " + getQuantidadeVendas());
    }

    @Override
    public String realizarLogin() {
        return super.realizarLogin() + "\nPerfil Gerente.";
    }

    @Override
    public String realizarLogoff() {
       return super.realizarLogoff() + "\nPerfil Gerente.";
    }

    @Override
    public String alterarDados() {
       return super.alterarDados() + "\nPerfil Gerente.";
    }

    @Override
    public String alterarSenha() {
       return super.alterarSenha() + "\nPerfil Gerente.";
    }

}
