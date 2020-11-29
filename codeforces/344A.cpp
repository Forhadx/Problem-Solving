#include<iostream>
using namespace std;
 
int main()
{
    int n,i,f=1;
    cin>>n;
    int arr[n];
 
    for(i=0; i<n; i++){
        cin>>arr[i];
    }
    for(i=1; i<n; i++){
        if( (arr[i-1]==10 && arr[i]==01) || (arr[i-1]==01 && arr[i]==10) )
            f++;
    }
    cout<<f;
    return 0;
}