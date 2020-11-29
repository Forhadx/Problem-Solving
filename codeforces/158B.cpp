#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int i,j,n,num;
    cin>>n;
    num = n;
    int s[n],arr[n];
 
    for(i=0; i<n; i++){
        cin>>s[i];
        arr[i] = 4;
    }
    sort(s,s+n, greater<int>());
    i=0;
    while(i<n){
        for(j=0; j<n; j++){
            if(arr[j]>=s[i]){
                arr[j] -= s[i];
                break;
            }
        }
        i++;
    }
    for(i=0; i<n; i++)
        if(arr[i] == 4)
            num--;
    cout<<num;
 
 
    return 0;
}
