#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    string str;
    cin>>str;
 
    transform(str.begin(),str.end(),str.begin(),::toupper);
 
    int i,j,f;
    for(i=65; i<=90; i++){
        f = 0;
        for(j=0; j<n; j++){
            if( i == int(str[j]) ){
                f = 1;
                break;
            }
        }
 
        if(f==0){
            cout<<"NO";
            return 0;
        }
    }
    cout<<"YES";
 
}