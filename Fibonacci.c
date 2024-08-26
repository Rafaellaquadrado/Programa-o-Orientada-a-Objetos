#include <stdio.h>


int main () 
{

int num1, num2, aux, pos; 

 printf("Qual posiçao do termo de fibonacci:");
 scanf("%d", &npos);

 num1=1;
 num2=1;

 for(int i=2;i<pos;i++)
 {
  aux = num2;
  num1=num2+num1;
  num2 = aux;
}

printf("%dº na sequencia de Fibonacci é %d.", pos, num2);

}

