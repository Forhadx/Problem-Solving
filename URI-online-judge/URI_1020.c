#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
  int N,y,m,d;
    scanf("%d",&N);
    y=N/365;
    d=N%365;
    printf("%d ano(s)\n",y);
    m=d/30;
    printf("%d mes(es)\n",m);
    d=d%30;
    printf("%d dia(s)\n",d); 
    return 0;
}