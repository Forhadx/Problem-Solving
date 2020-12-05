#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
 
   int X,Y;
    float Total;
    scanf("%d%d",&X,&Y);
    if(X==1){
        Total=Y*4.00;
        printf("Total: R$ %.2f\n",Total);
    }
    else if(X==2){
        Total=Y*4.50;
        printf("Total: R$ %.2f\n",Total);
    }
     else if(X==3){
        Total=Y*5.00;
        printf("Total: R$ %.2f\n",Total);
    }
     else if(X==4){
        Total=Y*2.00;
        printf("Total: R$ %.2f\n",Total);
    }
     else if(X==5){
        Total=Y*1.50;
        printf("Total: R$ %.2f\n",Total);
    }
    return 0;
}