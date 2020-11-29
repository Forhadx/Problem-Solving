#include<iostream>
using namespace std;
 
int main()
{
    int t,a,b,ans;
    cin>>t;
    while(t--){
        cin>>a>>b;
        ans = 0;
        if(a%b == 0){
            ans = 0;
        }
        else if(a>b){
            ans = b - (a%b);
        }
        else{
            ans = b - a;
        }
        cout<<ans<<endl;
    }
}
 