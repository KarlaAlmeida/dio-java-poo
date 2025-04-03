public abstract class Ingresso{

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

    public abstract String getValorReal();
    
}
