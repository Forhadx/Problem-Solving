#include <stdio.h>
#include <string.h>
 
int main()
{
   char string[100],str[100];
   int i,k;
   gets(string);
   strlwr(string);
   for(i=0; i<strlen(string); i++){
      if(string[i]!= 'a' && string[i]!='e' && string[i]!='i' && string[i]!='o' && string[i]!='u'&& string[i]!='y'){
        printf(".%c",string[i]);
      }
   }
   return  0;
}