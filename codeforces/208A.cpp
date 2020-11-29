#include<iostream>
using namespace std;
 
int main()
{
    string str;
    cin>>str;
    int ln = str.length();
    int c=0,f=0;
    for(int i=0; i<ln ; i++){
        if(str[i]== 'W' && str[i+1]=='U' && str[i+2]=='B' ){
            i = i+2;
            if(f == 1)
                continue;
            if(c == 1){
                cout<<" ";
                f = 1;
            }
 
        }
        else{
            cout<<str[i];
            c = 1;
            f = 0;
        }
 
    }
 
    return 0;
}