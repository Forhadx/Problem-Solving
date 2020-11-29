#include <stdio.h>
 
int main()
{
    long long int n,k;
    scanf("%I64d%I64d",&n,&k);
 
 
        if(k<=(n+1)/2){
            printf("%I64d",(2*k)-1);
         }
         else{
            printf("%I64d",(k-(n+1)/2)*2);
         }
 
 
    return  0;
}