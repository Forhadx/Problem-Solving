#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,i,j,f=0;;
    cin>>n;
    string x[n];
 
    for(i=0; i<n; i++){
        cin>>x[i];
    }
 
    for(i=0; i<n; i++){
        for(j=0; j<5; j++){
            if(x[i][0] =='O' && x[i][1]=='O'){
                x[i][0] ='+';
                x[i][1] ='+';
                f = 1;
                break;
            }
            if(x[i][3] =='O' && x[i][4]=='O'){
                x[i][3] ='+';
                x[i][4] ='+';
                f = 1;
                break;
            }
        }
        if(f == 1){
            cout<<"YES"<<endl;
            break;
        }
    }
    if(f == 0){
        cout<<"NO";
        return 0;
    }
    for(i=0; i<n; i++){
        cout<<x[i]<<endl;
    }
    return 0;
}