#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
  int number,hour;
    float amount,SALARY;

    scanf("%d%d%f",&number,&hour,&amount);
    SALARY=hour*amount;
    printf("NUMBER = %d\n",number);
    printf("SALARY = U$ %.2f\n",SALARY);
    return 0;
}