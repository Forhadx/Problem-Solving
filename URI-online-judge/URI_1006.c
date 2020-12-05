#include <stdio.h>
 
int main() {

    float A,B,C,T;
    scanf("%f%f%f",&A,&B,&C);
    T = ((A*2)+(B*3)+(C*5))/(2+3+5);
    printf("MEDIA = %.1f\n",T);

 
    return 0;
}