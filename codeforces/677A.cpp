#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int i,n,h,ans=0;
    cin>>n>>h;
    int arr[n];
 
    for(i=0; i<n; i++){
        cin>>arr[i];
        if(arr[i]<=h)
            ans += 1;
        else
            ans += 2;
    }
 
    cout<<ans;
 
    return 0;
}
