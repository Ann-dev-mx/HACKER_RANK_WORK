#include <bits/stdc++.h>
#include<iostream>

using namespace std;

// Complete the utopianTree function below.
int utopianTree(int n) {
    int sum =1;
    if(n > 0){
      for(int i=1;i<=n;i++){
        if(i%2 == 0){
            sum=sum+1;
        } 
        else{
            sum = sum+sum;
        } 
      }
      return sum;
      } 
      return 1;
    }



int main()
{
    int t;
    cin>>t;
    int ar[t];
    for(int i =0;i<t;i++){
        cin>>ar[i];
        cout<<utopianTree(ar[i])<<endl;
    }
   
    
}

