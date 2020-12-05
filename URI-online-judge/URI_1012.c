#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
    double A,B,C,T;
   scanf("%lf%lf%lf",&A,&B,&C);
   T=(A*C)/2;
   printf("TRIANGULO: %.3lf\n",T);
   T=3.14159*C*C;
   printf("CIRCULO: %.3lf\n",T);
   T=((A+B)*C)/2;
   printf("TRAPEZIO: %.3lf\n",T);
   T=B*B;
   printf("QUADRADO: %.3lf\n",T);
   T=A*B;
   printf("RETANGULO: %.3lf\n",T);
 
    return 0;
}