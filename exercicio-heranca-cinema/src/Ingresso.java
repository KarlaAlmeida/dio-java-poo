public class Ingresso{

    protected double valor;
    //String nomeFilme;
    //String lingua;


    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
        return;
    }

    public String getValorReal(){
        return "O valor do ingresso individual é " + valor + " reais.";
    }
    
}
