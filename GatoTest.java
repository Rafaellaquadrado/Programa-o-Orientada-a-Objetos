import java.util.Scanner;

public class GatoTest
{
  public static void main(String[] args)
  {
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Qual nome do seu gato:");
   String nome = entrada.nextline();

   Gato gatoDeBotas = new Gato();
   gatoDeBotas.miar(nome);
  }


}