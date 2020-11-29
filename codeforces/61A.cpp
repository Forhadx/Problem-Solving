#include<iostream>
using namespace std;
 
int main()
{
    string str1,str2,str3;
    cin>>str1>>str2;
    int ln = str1.length();
    int i;
    for(i=0; i<ln; i++){
        if(str1[i] != str2[i])
            str1[i] = '1';
        else
            str1[i] = '0';
    }
 
    cout<<str1;
 
    return 0;
}
