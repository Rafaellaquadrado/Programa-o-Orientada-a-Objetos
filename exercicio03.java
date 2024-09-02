import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        
        scanner.close();

        
        double delta = b * b - 4 * a * c;

       
        if (a == 0) {
            System.out.println("O coeficiente a deve ser diferente de zero para ser uma equação do segundo grau.");
        } else if (delta > 0) {
            
            double raizDelta = Math.sqrt(delta);
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);

            System.out.printf("As raízes da equação são: x' = %.2f e x'' = %.2f%n", x1, x2);
        } else if (delta == 0) {
            
            double x = -b / (2 * a);

            System.out.printf("A raiz da equação é: x = %.2f%n", x);
        } else {
           
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
