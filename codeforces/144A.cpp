#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
 
    int i,arr[n],time;
 
    for(i=0; i<n; i++)
        cin>>arr[i];
 
    int min = arr[0];
    int max = arr[0];
    int minP=0,maxP=0;
 
    for(i=0; i<n; i++){
        if(arr[i] <= min ){
            minP = i;
            min = arr[i] ;
        }
 
        if(arr[i] > max){
            maxP = i;
            max = arr[i];
        }
 
    }
 
    if(maxP < minP){
        time = maxP + ((n-1) - minP);
    }
 
    if(maxP > minP){
        time = maxP + ((n-1) - minP) - 1;
    }
 
    cout<<time;
 
}