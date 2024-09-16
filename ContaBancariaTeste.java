import java.util.Scanner;

public class ContaTeste
{

  public static void main(String[] args)
  {
  
    double saldo, limite, valor;
    int numero;

    Scanner entrada = new Scanner(System.in); 

    System.out.println("Qual o numero da conta: ");
    numero = entrada.nextInt();

    System.out.println("Qual o numero do saldo: ");
    saldo = entrada.nexDouble();

    System.out.println("Quanto de limite: ");
    limite = entrada.nextDouble();

    ContaBancaria conta1 = new ContaBancaria(numero, saldo, limite);

    System.out.printf("A conta de %d foi criada com saldo de R$%.2f e limite de R$%.2f", conta1.getNumero(), conta1.getSaldo(), conta1.getLimite());
    

    while(true)
    {
    System.out.println("Voce quer 1-depositar ou 2-sacar: ");
    if (entrada.nextInt()==1)
    {
     System.out.println("Qual o valor do deposito: ");
     valor = entrada.nextDouble();

    conta1.deposito(valor);
    }
    else if (entrada.nextInt() ==2)
    {
     System.out.println("Qual o valor do saque: ");
     valor = entrada.nextDouble(); 
     
     conta1.saca(valor);
    }else
     {
      break;
     }
   } 
  }



}