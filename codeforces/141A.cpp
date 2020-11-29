#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    string s1,s2,s3;
    cin>>s1>>s2>>s3;
    s1 += s2;
 
    int i,j;
    if(s3.size() == s1.size()){
       for(i=0; i<s3.size(); i++){
            for(j=0; j<s1.size(); j++){
                if(s3[i] == s1[j]){
                    s1[j] = '0';
                    break;
                }
            }
        }
    }
    else{
        cout<<"NO";
        return 0;
    }
    
    for(i=0; i<s1.size(); i++){
        if(s1[i] != '0'){
            cout<<"NO";
            return 0;
        }
    }
    cout<<"YES";
}
