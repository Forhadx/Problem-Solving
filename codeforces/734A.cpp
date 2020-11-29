#include<iostream>
using namespace std;
 
int main()
{
    int a=0,b=0,i,n;
    cin>>n;
    string str;
    cin>>str;
 
    for(i=0; i<n; i++){
        if(str[i] == 'A')
            a++;
        if(str[i] == 'D')
            b++;
    }
    if(a>b)
        cout<<"Anton";
    if(a<b)
        cout<<"Danik";
    if(a==b)
        cout<<"Friendship";
    return 0;
}
