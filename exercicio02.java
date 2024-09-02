import java.util.Scanner;

public class SeparadorDeDigitos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite um número de cinco dígitos: ");
        int num = scanner.nextInt();

        scanner.close();

       
        if (num >= 10000 && num <= 99999) {
            
            String numString = Integer.toString(num);

            
            for (int i = 0; i < numString.length(); i++) {
                // Imprime o dígito atual
                System.out.print(numString.charAt(i));

                
                if (i < numString.length() - 1) {
                    System.out.print("   ");
                }
            }
            
            System.out.println();
        } else {
            
            System.out.println("O número deve ter exatamente cinco dígitos.");
        }
    }
}
