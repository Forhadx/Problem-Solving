#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string str1,str2="";
    getline (cin, str1);
    int ln= str1.length();
    int i,j=0,k,n=0;
    if(ln==2){
        cout<<n;
        return 0;
    }
 
    for(i=1; i<ln; i=i+3){
        str2 = str2 + str1[i];
    }
    j = str2.length();
    n = j;
    for(i=0; i<j-1; i++){
        for(k=i+1; k<j; k++){
            if(str2[i]==str2[k] && str2[i]!='1'){
                str2[k] = '1';
                n--;
            }
        }
    }
    cout<<n;
 
    return 0;
}