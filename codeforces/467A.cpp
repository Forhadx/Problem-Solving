#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int n,i,p,q,f=0;
    cin>>n;
 
    for(i=0; i<n; i++){
        cin>>p>>q;
        if( (q-p) >= 2)
            f++;
    }
    cout<<f;
 
 
   return 0;
}
