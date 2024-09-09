import java.util.Scanner;
import javax.swing.JOptionPane;

public class GatoTest
{
  public static void main(String[] args)
  {
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Qual nome do seu gato:");
   String nome = entrada.nextline();

   Gato gatoDeBotas = new Gato("jose", "07/09/2010", 0.5);
   gatoDeBotas.setNome = (texto);
   System.out.printf("O nome do seu gato é: %s\n", gatoDeBotas.getNome); 
   gatoDeBotas.miar();
   gatoDeBotas.lamber();

   //System.out.println("Qual o nome do seu gato:");
   //String texto = entrada.nextLine();

   String texto = JOptionPane.inputMessageDialog(null, "Qual o nome do seu gato:");
  }
