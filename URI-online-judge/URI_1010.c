#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
      int p1,p2,n1,n2;
    float pr1,pr2,t;
    scanf("%d%d%f",&p1,&n1,&pr1);
    scanf("%d%d%f",&p2,&n2,&pr2);
    t=(n1*pr1)+(n2*pr2);

    printf("VALOR A PAGAR: R$ %.2f\n",t);
 
    return 0;
}