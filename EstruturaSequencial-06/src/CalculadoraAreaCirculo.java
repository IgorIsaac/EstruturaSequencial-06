import java.util.Scanner;

public class CalculadoraAreaCirculo {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble(); // Lê o valor do raio digitado pelo usuário

        // Calcular a área do círculo
        double area = Math.PI * Math.pow(raio, 2); // Fórmula da área do círculo: pi * raio^2

        // Exibir a área do círculo
        System.out.println("A área do círculo com raio " + raio + " é: " + area);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
