import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

       
        scanner.close();

       
        int soma = num1 + num2;
        int produto = num1 * num2;
        int diferenca = num1 - num2;
        double divisao = 0;

        
        if (num2 != 0) {
            divisao = (double) num1 / num2;
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }

       
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        System.out.println("Diferença: " + diferenca);
        if (num2 != 0) {
            System.out.println("Divisão: " + divisao);
        }
    }
}
