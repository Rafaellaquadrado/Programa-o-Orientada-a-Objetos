import java.util.Scanner;

public class Tempo
{
  Public static void main(string[] args)
  {
   int tempo, dia, hora, min, seg;

   Scanner entrada = new Scanner(System.in);

   System.out.println("Entre com o tempo em segundos:");
   tempo = entrada.nextInt();

  seg = tempo%60;
  min = (tempo/60)%60;
  hora = ((tempo/60)/60)%24;
  dia = ((tempo/60)/60)/24;
  
  System.out.printf("%d dias, %d/%d/%d", dia, hora, min, seg);
  }
}
