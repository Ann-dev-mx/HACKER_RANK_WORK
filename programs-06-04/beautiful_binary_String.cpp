//Beautiful Binary String


#include <bits/stdc++.h>

using namespace std;

// Complete the beautifulBinaryString function below.
int beautifulBinaryString(string a,string b,int n) {
    int count =0;
    char a1[3 + 1];
     strcpy(a1, a.c_str());
     char b1[n + 1];
     strcpy(b1, b.c_str());
   for (int i=2;i<n;i++){
    if (b1[i]=='0' && b1[i-2]=='0' && b1[i-1]=='1') {
        count++; 
        i+=2;
        }
}
return count;
}

int main()
{
   

    int n;
    cin >> n;
    
    string b;
    cin>>b;
    string a ="010";
    cout<<beautifulBinaryString(a,b,n);
    return 0;
}

