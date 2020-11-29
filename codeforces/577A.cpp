#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,x,i=1,j,c=0,f=0;
    cin>>n>>x;
 
    while(i<=n){
        //cout<<x<<" "<<i<<endl;
        if(x%i == 0 && x/i <= n)
            f++;
        i++;
    }
    cout<<f;
    return 0;
}