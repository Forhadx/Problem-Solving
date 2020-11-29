#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,i,x=1,y=0;
    cin>>n;
    int arr[n];
    for(i=0; i<n; i++)
        cin>>arr[i];
    for(i=1; i<n; i++){
        if(arr[i]>=arr[i-1]){
            x += 1;
        }
        else{
            y = max(x, y);
            x = 1;
        }
    }
    cout<<max(x,y);
 
    return 0;
}