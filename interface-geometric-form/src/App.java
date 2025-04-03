import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        var option1 = -1;

        GeometricForm geometricForm = null;
	
	    do{
            System.out.println("===Escolha a forma geométrica para calcular a área:==="); 
            System.out.println("1 - Quadrado."); 
            System.out.println("2 - Retângulo."); 
            System.out.println("3 - Círculo."); 
            System.out.println("0 - Sair do programa.");

            option1 = scanner.nextInt();

            switch (option1){
                case 1 -> geometricForm = createSquare();
                case 2 -> geometricForm = createRectangle();
                case 3 -> geometricForm = createCircle();
                case 0 -> {
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opção inválida.");
                    continue;
                }
            }

            System.out.println("A área da forma geométrica escolhida é " + geometricForm.getArea());

        }while (option1 != 0);
        
    }

    private static GeometricForm createSquare(){
        System.out.println("Informe o tamanho dos lados do quadrado.");
        var side = scanner.nextDouble();
        return new Square(side);
    }
    private static GeometricForm createRectangle(){
        System.out.println("Informe o tamanho da base do retângulo.");
        var base = scanner.nextDouble();
        System.out.println("Informe o tamanho da altura do retângulo.");
        var height = scanner.nextDouble();
        return new Rectangle(base, height);
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe o raio do círculo.");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
