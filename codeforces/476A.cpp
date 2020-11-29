#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,m,num=0,i=0,val;
    cin>>n>>m;
    if(n<m){
        cout<<"-1";
        return 0;
    }
    if(n%2 == 0){
        num = n/2;
        while(num>=0){
            val = num + 2*i;
            if(val%m == 0)
                break;
            i++;
            num--;
        }
    }
    else{
         num = floor(n/2);
         while(num>=0){
            val = num + 2*i +1;
            if(val%m == 0)
                break;
            i++;
            num--;
        }
    }
    cout<<val;
 
    return 0;
}
 