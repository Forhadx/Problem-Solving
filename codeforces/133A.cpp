#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string str1 = "HQ9+";
    string str;
    cin>>str;
    int len = str.length();
    int i,t=0;
    for(int i =0; i<len; i++){
        if(str[i]=='H' || str[i]=='Q' || str[i]=='9')
            t = 1;
    }
    if(t == 1)
        cout<<"YES";
    else
        cout<<"NO";
    return 0;
}