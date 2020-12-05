#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
 
 float A,B,C,R1,R2;
    scanf("%f%f%f",&A,&B,&C);
    if( A>0 && ((B*B)-(4*A*C)) >=0 ){
        R1 = ((-B+sqrt(((B*B)-(4*A*C))))/(2*A));
        printf("R1 = %.5f\n",R1);
        R2 = ((-B-sqrt(((B*B)-(4*A*C))))/(2*A));
        printf("R2 = %.5f\n",R2);
    }

    else{
        printf("Impossivel calcular\n");
    }

    return 0;
}