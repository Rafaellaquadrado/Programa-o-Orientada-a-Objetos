import java.util.Scanner;

public class Digitos
{
  Public static void main(string[] args)
  {
   
   int num;

   Scanner entrada = new Scanner(System.in);

   System.out.println("Entre com numero: ");
   num = entrada.nextInt();

   System.out.print("%d", num/10000);
   num = num%10000;

   System.out.print("%d", num/1000);
   num = num%1000;

   System.out.print("%d", num/100);
   num = num%100;

   System.out.print("%d", num/10);
   num = num%10;

   System.out.print("%d", num/1);
   num = num%1;

  }

}