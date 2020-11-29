#include<iostream>
using namespace std;
 
int main()
{
    int a,b,f=0;
    cin>>a>>b;
    while(a <= b){
        a *= 3;
        b *=2;
        f++;
    }
    cout<<f;
    return 0;
}