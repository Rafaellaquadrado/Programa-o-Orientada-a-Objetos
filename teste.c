#include <stdio.h>

int main () {

int num, result=0;

printf("Entre com um numero:");
scanf("%d", &num);

for(int i=0; i<num; i++) {
 result = result + 2*i+1;
}
printf("%d ao quadrado é %d.", num, result);
}
