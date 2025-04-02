import java.util.Scanner;

public class IngressoFamilia extends Ingresso {

    int nPessoas;

    public String getValorReal(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de pessoas.");
        nPessoas =  scanner.nextInt();

        if(nPessoas > 3){
            valor = 0.95*(nPessoas*valor);
        }
        else{
            valor = nPessoas*valor;
        }
        return "O valor total dos ingressos família para " + nPessoas + " pessoas é " + valor + " reais.";
    }
}
