#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string str;
    int i,j=0,k=0;
    cin>>str;
    int len = str.length();
    for(i=0; i<len; i++){
        if(isupper(str[i]))
            j++;
        if(islower(str[i]))
            k++;
    }
 
    if(j == k){
        for(i=0; i<len; i++)
            str[i] = tolower(str[i]);
    }
    else if(j>k){
        for(i=0; i<len; i++)
            str[i] = toupper(str[i]);
    }
    else{
        for(i=0; i<len; i++)
            str[i] = tolower(str[i]);
    }
 
    cout<<str;
 
    return 0;
}