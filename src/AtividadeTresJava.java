import java.util.Scanner;

public class AtividadeTresJava {
    public static void main(String[] args) {
     //calcularRaizQuadrada();
     radar();

    };

    // 1°

    public static void calcularRaizQuadrada(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        double resultado = Math.sqrt(num);

        if(resultado % 1 == 0){
            System.out.println(" A raiz quadrada é " + resultado );
        } else {
            System.out.println(" Não há raiz quadrada para " + num);
        }

        scanner.close();
    };


    // 2°

    public static void radar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a velocidade permitida na via em km/h? ");
        double velocidadeDaVia = scanner.nextDouble();

        System.out.print("Digite a velocidade do veiculo em km/h ");
        double velocidadeMotorista = scanner.nextDouble();

        double limiteSuperior = 1.2 * velocidadeDaVia;

        if (velocidadeMotorista <= velocidadeDaVia) {
            System.out.println("Sem multa.");
        } else if (velocidadeMotorista <= limiteSuperior) {
            System.out.println("Multa leve.");
        } else {
            System.out.println("Multa grave.");
        }
        scanner.close();
    };

}
