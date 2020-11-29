#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    string str;
    int ans = 0;
    for(int i=0; i<n; i++){
        cin>>str;
        if(str == "Tetrahedron")
            ans += 4;
        if(str == "Cube")
            ans += 6;
        if(str == "Octahedron")
            ans += 8;
        if(str == "Dodecahedron")
            ans += 12;
        if(str == "Icosahedron")
            ans += 20;
    }
    cout<<ans;
}