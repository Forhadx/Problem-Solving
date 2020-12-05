#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
    int N,m,h,r;
    scanf("%d",&N);
    h=N/3600;
    r=N%3600;
    m=r/60;
    r=r%60;
    printf("%d:%d:%d\n",h,m,r);
    return 0;
}