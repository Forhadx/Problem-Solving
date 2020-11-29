#include<iostream>
using namespace std;
 
int main()
{
    int x,res=0;
 
    cin>>x;
 
    if(x<6){
        res++;
 
    }
    else{
        res = x/5;
        int l = x%5;
        if(l < 6 && l >0){
            res++;
         }
    }
    cout<<res;
 
    return 0;
}