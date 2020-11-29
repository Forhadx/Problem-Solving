#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int num;
    cin>>num;
    string s;
    cin>>s;
    int i,j,n=0,o=0,e=0,r=0,z=0,f1=0,f2=0;
 
    for(i=0; i<num; i++){
        if(s[i]=='n')
            n++;
        if(s[i]=='o')
            o++;
        if(s[i]=='e')
            e++;
        if(s[i]=='z')
            z++;
        if(s[i]=='r')
            r++;
    }
 
    while(n>0 || z>0){
        if(n>0){
            f1=n;
            o -= n;
            e -= n;
            n -= n;
        }
        if(z>0){
            f2 = z;
            e -= z;
            r -= z;
            o -= z;
            z -= z;
        }
    }
    if(f1>0){
         for(i=0; i<f1; i++)
            cout<<1<<" ";
    }
 
    if(f2>0){
        for(i=0; i<f2; i++)
            cout<<0<<" ";
    }
 
 
    return 0;
}
 