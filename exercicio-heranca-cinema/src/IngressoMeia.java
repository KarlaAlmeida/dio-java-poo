public class IngressoMeia extends Ingresso {

    @Override
    public String getValorReal(){
        return "O valor do ingresso meia é " + (valor/2) + " reais.";
    }
}
