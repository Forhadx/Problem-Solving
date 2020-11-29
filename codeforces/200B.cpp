#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,i;
    double a=0.0,b=0.0;
    cin>>n;
    double arr[n];
    for(i=0; i<n; i++){
        cin>>arr[i];
        a += arr[i]/100;
    }
    b = (a/n)*100;
    cout<<b;
    return 0;
}