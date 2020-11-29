#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    int ans=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
    cin>>n;
 
    if(n>=100){
        a = n/100;
        b = n%100;
        n = b;
    }
    if(n>=20){
        c = n/20;
        d = n%20;
        n = d;
    }
    if(n>=10){
        e = n/10;
        f = n%10;
        n = f;
    }
   if(n>=5){
        g = n/5;
        h = n%5;
        n = h;
    }
    if(n<5){
        i = n;
    }
    ans = a+c+e+g+i;
    cout<<ans;
    return 0;
}
