#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,m;
    cin>>n>>m;
    int i,j,f=0;
 
    for(i=0; i<n; i++){
        if(i%2==0){
           for(j=0; j<m; j++){
                cout<<"#";
            }
            cout<<endl;
            continue;
        }
        if(i%2 != 0 && f==0){
           for(j=0; j<m; j++){
                if(j==m-1){
                    cout<<"#";
                }
                else{
                    cout<<".";
                }
            }
            f = 1;
            cout<<endl;
            continue;
        }
        if(i%2 != 0 && f==1){
           for(j=0; j<m; j++){
                if(j==0){
                    cout<<"#";
                }
                else{
                    cout<<".";
                }
            }
            f = 0;
        }
 
        cout<<endl;
    }
}

/*
#include<bits/stdc++.h>
using namespace std;
 
 
int main()
{
    int n,m;
    cin>>n>>m;
 
    int i,j,f=0;
    for(i=0; i<n; i++){
        for(j=0; j<m; j++){
            if(i%2==0){
                cout<<"#";
            }
            else if(i%2 != 0 && f==0){
                if(j==m-1){
                    cout<<"#";
                    f = 1;
                }
                else{
                    cout<<".";
                }
                continue;
            }
            else if(i%2 != 0 && f==1){
 
                if(j==0){
                    cout<<"#";
                }
                else{
                    cout<<".";
                    if(j == m-1)
                        f=0;
                }
 
            }
        }
        cout<<endl;
    }
}

*/