import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {
        // imprimirNome();
        // verificaParOuImpar();
        // verificarNumerosPrimos();
        // somaNumeros();
        // verificarMaiorOuMenor();
        // verificarPalindromo();
        contarVogais();
    };

    // 1°
    public static void imprimirNome() {

        System.out.println(" Olá Mundo :D");
    };

    // 2°
    public static void verificaParOuImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        scanner.close();

        if ((n % 2) == 0) {
            System.out.println(n + " É um numero par ");
        } else {
            System.out.println(n + " É um numero impar ");
        }

    };

    // 3°

    public static void verificarNumerosPrimos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int numero = scanner.nextInt();
        int cont = 0;
        scanner.close();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.print(numero + " é um numero primo");
        } else {
            System.out.print(numero + " não é um numero primo");
        }
    }

    // 4°
    public static void somaNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 a " + numero + " é: " + soma);

        scanner.close();
    }

    // 5°
    public static void verificarMaiorOuMenor() {
        int maior = 0;
        int menor = 0;
        int qntNumeros;
        int arrayNumeros[];

        Scanner scanner = new Scanner(System.in);
        System.out.println("informe quantos numeros deseja colocar! ");
        qntNumeros = scanner.nextInt();

        arrayNumeros = new int[qntNumeros];

        for (int i = 0; i < qntNumeros; i++) {
            System.out.println("digite " + (i + 1) + "º valor e aperte enter");
            arrayNumeros[i] = scanner.nextInt();
            menor = arrayNumeros[i];
            maior = arrayNumeros[i];
            scanner.close();
        }

        for (int i = 0; i < qntNumeros; i++) {
            if (arrayNumeros[i] > maior) {
                maior = arrayNumeros[i];
            } else if (arrayNumeros[i] < menor) {
                menor = arrayNumeros[i];
            }
        }
        System.out.println("o maior numero é " + maior);
        System.out.println("o menor numero é " + menor);
    };
    // 6°

    public static void verificarPalindromo() {

        Scanner scanner = new Scanner(System.in);

        String contrario = "";

        System.out.println("Digite uma palavra para verificar se é um palíndromo");
        String nome = scanner.nextLine();
        scanner.close();

        for (int i = (nome.length() - 1); i >= 0; i--) {
            contrario = contrario + nome.charAt(i);
        }

        if (contrario.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("A palavra " + nome + " é palíndromo ");
        } else {
            System.out.println("A palavra " + nome + " não é palíndromo ");
        }
    };

    public static void contarVogais() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto ");
        String texto = scanner.nextLine();
        scanner.close();

        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        };

        System.out.println("O texto tem " + contador + " vogais ");

    };

}
