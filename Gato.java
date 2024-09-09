import javax.swing.JOptionPane;
public class Gato
{
  private String nome;
  private String dataNasc;
  private String peso;

  public Gato(String nome, String dataNasc, double peso)
  {
    this.nome = nome;
    this.dataNasc = dataNasc;
    this.peso = peso;
  }


  public void miar(String nome)
  {
   //System.out.println(this.nome + "Miou!");
   JOptionPane.showMessageDialog(null, this.nome + "Miou!");
  }


  public void lamber
  {
   System.out.println(this.nome + "lambeu!");
  }

   public void setNome(String nome)
   {
    this.nome = nome;
   }
  
   public String getNome()
   {
   return this.nome;
  }


}
