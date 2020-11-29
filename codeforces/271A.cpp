#include<iostream>
using namespace std;
 
int main()
{
    int y,a,b,c,d,r,z;
    cin>>y;
    if(y>=1000 && y<=9000){
 
        do{
            y++;
            a = y/1000;
            r = y%1000;
 
            b = r/100;
            r = r%100;
 
            c = r/10;
            d = r%10;
 
        }while(a==b || b==c || c==d || d==a || a==c || b==d);
 
        cout<<y;
    }
 
    return 0;
}