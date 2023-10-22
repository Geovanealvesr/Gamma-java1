import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // printNome();
        // calculadora();
        // verificarCompraDeGame();
        // calcularCustoDeFrete();
        // calcularEntradaESaldo();
        // calcularTotalPago();
        // calculadoraDeRacao();
        // totalDeCompra();

    }

    public static void printNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenomeUsuario = scanner.nextLine();
        scanner.close();
        System.out.println("Seu nome é : " + nomeUsuario + " " + sobrenomeUsuario);
    }

    public static void calculadora() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        scanner.close();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double sobra = num1 % num2;

        String somaFormatada = String.format("%.2f", soma); // usei o String.format para transformar o valor em String e
        String subtracaoFormatada = String.format("%.2f", subtracao);
        String multiplicacaoFormatada = String.format("%.2f", multiplicacao);
        String divisaoFormatada = String.format("%.2f", divisao);
        String sobraFormatado = String.format("%.2f", sobra);

        System.out.println("Soma: " + somaFormatada);
        System.out.println("Subtração: " + subtracaoFormatada);
        System.out.println("Multiplicação: " + multiplicacaoFormatada);
        System.out.println("Divisão: " + divisaoFormatada);
        System.out.println("Resto da Divisão: " + sobraFormatado);
    }

    public static void verificarCompraDeGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade ");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Pode comprar o game.");
        } else {
            System.out.println("Não pode comprar o game.");
        }

        scanner.close();
    }

    public static void calcularCustoDeFrete() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do bairro: ");
        String bairro = scanner.nextLine();

        double custoFrete = obterCustoDeFrete(bairro);

        if (custoFrete >= 0) {
            System.out.println("Custo de frete para o bairro " + bairro + ": R$" + custoFrete);
        } else {
            System.out.println("Bairro não encontrado.");
        }

        scanner.close();
    }

    public static double obterCustoDeFrete(String bairro) {
        bairro = bairro.toLowerCase();

        if (bairro.equals("guaianases")) {
            return 10.0;
        } else if (bairro.equals("barra funda")) {
            return 15.0;
        } else if (bairro.equals("berrini")) {
            return 20.0;
        }

        return -1.0;
    }

    public static void calcularEntradaESaldo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o preço do veículo: ");
        double preco = scanner.nextDouble();

        double entrada = calcularEntrada(preco);
        double saldoParcelado = calcularSaldoParcelado(preco);

        System.out.println("Modelo do veículo: " + modelo);
        System.out.println("Preço do veículo: R$" + preco);
        System.out.println("Valor da entrada (30%): R$" + entrada);
        System.out.println("Saldo em 12x: R$" + saldoParcelado);

        scanner.close();
    }

    public static double calcularEntrada(double preco) {
        return preco * 0.30;
    }

    public static double calcularSaldoParcelado(double preco) {
        return (preco - calcularEntrada(preco)) / 12;
    }

    public static void calcularTotalPago() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        System.out.print("Digite o número de peixes obtidos na pescaria: ");
        int numPeixes = scanner.nextInt();

        int custoEntrada = numPessoas * 20;

        int custoPeixesExtras = 0;
        if (numPeixes > numPessoas) {
            custoPeixesExtras = (numPeixes - numPessoas) * 12;
        }

        int precoTotal = custoEntrada + custoPeixesExtras;

        System.out.println("Total: R$" + precoTotal);

        scanner.close();
    }

    public static void calculadoraDeRacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da ração em Kg: ");
        double pesoRacaoKg = scanner.nextDouble();

        System.out.print("Digite a quantidade diária de ração consumida pelo cachorro em gramas: ");
        int consumoDiarioGramas = scanner.nextInt();

        int duracaoEmDias = (int) (pesoRacaoKg * 1000 / consumoDiarioGramas);

        int sobraRacaoGramas = (int) (pesoRacaoKg * 1000 % consumoDiarioGramas);

        System.out.println("A ração irá durar " + duracaoEmDias + " dias.");
        System.out.println("Sobrará " + sobraRacaoGramas + " gramas de ração.");

        scanner.close();
    }

    public static void totalDeCompra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total da compra: R$ ");
        double totalCompra = scanner.nextDouble();

        scanner.close();

        if (totalCompra < 20.00) {
            System.out.println("O valor mínimo de compra para parcelamento é R$ 20,00.");
        } else {

            int numeroMaximoParcelas = 1;

            double valorParcela = totalCompra;

            while (valorParcela >= 20.00 && numeroMaximoParcelas <= 6) {
                System.out.println("Parcela " + numeroMaximoParcelas + ": R$ " + valorParcela);
                numeroMaximoParcelas++;
                valorParcela = totalCompra / numeroMaximoParcelas;
            }
        }
    }
}
