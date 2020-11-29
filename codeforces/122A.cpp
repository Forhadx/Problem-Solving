#include<iostream>
using namespace std;
int main()
{
    int R,r,n,flag=0,fl=0;
    cin>>n;
    if(1<=n && n<=1000){
            R=n/100;
            r=n%100;
 
            if(R==4 || R==7){
                R=r;
                r=R%10;
                R=R/10;
                if(R==4 || R==7){
                    R=r;
                    if(R==4 || R==7)
                        flag=1;
                    else flag=0;
                }
                else if(R==0){
                    R=r;
                    if(R==4 || R==7)
                        flag=1;
                    else flag=0;
                }
                else flag=0;
 
            }
 
            else if(R==0){
                R=r;
                r=R%10;
                R=R/10;
                if(R==4 || R==7){
                    R=r;
                    if(R==4 || R==7)
                        flag=1;
                    else flag=0;
                }
                else if(R==0){
                    R=r;
                    if(R==4 || R==7)
                        flag=1;
                    else flag=0;
                }
                else flag=0;
            }
 
 
            else flag=0;
 
            if(n%4==0 || n%7==0 || n%47==0)
                fl=1;
            else fl=0;
    }
    if(flag==1 || fl==1)
        cout<<"YES"<<endl;
    else
        cout<<"NO"<<endl;
    return 0;
}