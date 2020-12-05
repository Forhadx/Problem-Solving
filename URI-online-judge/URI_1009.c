#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
      char name[100];
    scanf("%s",name);

    double salary,sale,TOTAL;
    scanf("%lf%lf",&salary,&sale);
    TOTAL = salary + ((sale*15)/100);
    printf("TOTAL = R$ %.2lf\n",TOTAL);
 
    return 0;
}