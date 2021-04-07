#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

int pickingNumbers(int n,int ar[]) {
    int count=0;
    for(int i=0;i<n;i++){
        int max =0;
        
        for(int j=0;j<n;j++){
         if(ar[j] == ar[i] || ar[j]== ar[i]+1){
             max++;
         }
         
        }
        if(max > count){
            count = max;
        }
        
    }
    return count;
}

int main()
{
   int n;
   cin>>n;
   int ar[n];
   for(int i =0;i<n;i++){
       
       cin>>ar[i];
   }
   cout<<pickingNumbers(n,ar);
}

