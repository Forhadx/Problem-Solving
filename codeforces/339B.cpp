#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    long long int n,m;
    cin>>n>>m;
    long long int arr[m],i;
    long long int ans=0;
    for(i=0; i<m; i++)
        cin>>arr[i];
    ans = arr[0];
    for(i=1; i<m; i++){
        if(arr[i-1]<arr[i]){
            ans += arr[i] - arr[i-1];
        }
        if(arr[i-1]>arr[i]){
            ans += arr[i] + (n - arr[i-1]);
        }
    }
    ans -= 1;
    printf("%I64d",ans);
}