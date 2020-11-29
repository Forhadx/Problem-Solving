#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
 
    int arr[n],i,e=0,o=0;
 
    for(i=0; i<n; i++)
        cin>>arr[i];
 
    for(i=0; i<n; i++){
        if(arr[i]%2 == 0){
            e++;
        }
        else{
            o++;
        }
 
    }
    if(e==1){
        for(i=0; i<n; i++){
            if(arr[i]%2 == 0){
                cout<<i+1;
                return 0;
            }
        }
    }
    if(o==1){
        for(i=0; i<n; i++){
            if(arr[i]%2 != 0){
                cout<<i+1;
                return 0;
            }
        }
    }
 
    return 0;
}

/*
#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
 
    int arr[n],i,e=0,o=0,x=0,y=0;
 
    for(i=0; i<n; i++)
        cin>>arr[i];
 
    for(i=0; i<n; i++){
        if(arr[i]%2 == 0){
            e++;
            x = i;
        }
        else{
            o++;
            y = i;
        }
 
        if(e>1 && o==1){
            cout<<y+1;
            return 0;
        }
        if(o>1 && e==1){
            cout<<x+1;
            return 0;
        }
    }
 
}

*/