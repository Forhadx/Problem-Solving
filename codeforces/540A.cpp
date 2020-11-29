#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,a,b,c,d,ans=0;
    cin>>n;
    int i;
    string x,y;
    cin>>x>>y;
 
    for(i=0; i<n; i++){
        a = x[i]-'0';
        b = y[i]-'0';
        c = abs(a - b);
        
        if(a > b){
            d = (10-a) + b;
        }
        else if(a < b){
            d = (10-b) + a;
        }
        else{
            d = a - b;
        }
 
        if(c > d){
            ans += d;
        }
        else if(c < d){
            ans += c;
        }
        else{
            ans += c;
        }
    }
 
    cout<< ans;
    return 0;
}