#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    long double m,n,a;
    long long  ans = 0;
    cin>>n>>m>>a;
 
 
    if(m<=a && n<=a)
        ans = 1;
    if(m>=a && n<=a)
        ans = ceil(m/a);
    if(n>=a && m<=a)
        ans = ceil(n/a);
    if(m>a && n>a)
        ans = ceil(m/a) * ceil(n/a);
 
    cout<<std::fixed<<ans;
 
    return 0;
}