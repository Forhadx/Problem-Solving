#include <stdio.h>
 
int main() {
 
  
  double X1,Y1,X2,Y2,T;
   scanf("%lf%lf%lf%lf",&X1,&Y1,&X2,&Y2);
   T=sqrt( ((X2-X1)*(X2-X1)) + ((Y2-Y1)*(Y2-Y1)) );
   printf("%.4lf\n",T);
 
    return 0;
}