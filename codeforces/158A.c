
#include<stdio.h>
 
int main ()
{
    int i,j,k,n,a[50];
    j=0;
    scanf("%d%d",&n,&k);
    if( k>=1 && n>=1 && k<=50 && n<=50 && k<=n  ){
        for(i=0; i<n; i++){
            scanf("%d",&a[i]);
        }
        for(i=0; i<n; i++){
            if(a[i]>0 && a[i]>=a[k-1])
                j++;
        }
 
    }
    printf("%d",j);
 
    return 0;
}

