public class Cosseno
{

   public static void main(String[] args)
   {
     int num, fatorial=1;
     double x=60.0, cos=0, j=0;
     num=4; 

     /*for(int count=num; count>=1; count--)
     {
        fatorial = fatorial*count;
        
     }*/
     
     x = x*3.14/180.0;
     for(int i=0; i<10; i+=2)
     {
      num=i;
      fatorial=1;
      while(num>=1)
      {
         fatorial = fatorial*num;
         num--;
      }

     cos = cos + Math.pow(-1,j)*Math.pow(xRad,i)/fatorial;
     j++;
}

     System.out.printf("O cos(%.1f) = %.3f", x, cos);
