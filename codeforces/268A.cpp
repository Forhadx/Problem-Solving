#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,i,j,f=0;
    cin>>n;
    int arr[n][2];
 
    for(i=0; i<n; i++){
        cin>>arr[i][0]>>arr[i][1];
    }
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            if(arr[i][0] == arr[j][1])
                f += 1;
        }
    }
    cout<<f;
 
    return 0;
}