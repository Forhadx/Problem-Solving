#include<stdio.h>
int main()
{
    char s[100];
    int n,c;
    scanf("%d",&n);
    while(n--){
        scanf("%s",s);
        c=strlen(s);
        if(c<=10){
            printf("%s\n",s);
        }
        else{
             printf("%c%d%c\n",s[0],c-2,s[c-1]);
        }
    }
 
    return 0;
}
