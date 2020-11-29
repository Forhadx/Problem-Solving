#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    long long int s[4];
    int i,f=0;
    for(i=0; i<4; i++)
        cin>>s[i];
    sort(s,s+4);
    for(i=1; i<4; i++){
        if(s[i-1] == s[i])
            f++;
    }
    cout<<f;
 
    return 0;
}