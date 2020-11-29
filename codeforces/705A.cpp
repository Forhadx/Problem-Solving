#include<iostream>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
 
    for(int i=1; i<=n; i++){
        if(i%2 != 0)
            cout<<"I hate ";
        else{
            cout<<"that I love ";
            if(i < n)
                cout<<"that ";
        }
    }
    cout<<" it";
 
    return 0;
}
 