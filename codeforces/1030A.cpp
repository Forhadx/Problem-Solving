#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
 
    int i,arr[n], t = 0;
 
    for(i=0; i<n; i++){
        cin>>arr[i];
 
        if(arr[i] == 1) t=1;
    }
 
    if(t==1)
        cout<<"HARD";
    else
        cout<<"EASY";
 
}