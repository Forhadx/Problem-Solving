#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */ int A,B,C,D;
   scanf("%d%d%d%d",&A,&B,&C,&D);
   if(B>C && D>A && C+D>A+B && D>=0 && C>=0 && A%2==0){
    printf("Valores aceitos\n");
   }
   else{
    printf("Valores nao aceitos\n");
   }
 
    return 0;
}