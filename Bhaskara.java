mport java.util.Scanner;

public class Digitos
{
  Public static void main(string[] args)
  {
   double a, b, c, delta, x1, x2;

   Scanner entrada = new Scanner(System.in);

   System.out.println("Entre com o coeficiente \'a\':");
   a = entrada.nextDouble();

   System.out.println("Entre com o coeficiente \'b\':");
   b = entrada.nextDouble();

   System.out.println("Entre com o coeficiente \'c\':");
   c = entrada.nextDouble();

   delta = b*b - 4*a*c;

   x1 = (-b + Math.sqrt(delta))/(2*a);

   x2 = (-b - Math.sqrt(delta))/(2*a);

  System.out.printf("%.1fx^2 + %.1fx + %.1fc=0 possui x1=%.1f e x2 = %.1f", a, b, c, x1, x2);

  }

}