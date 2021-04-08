#include <bits/stdc++.h>

using namespace std;



int reverse(int a){
    int reversedNumber = 0, remainder;
    while(a != 0) {
        remainder = a%10;
        reversedNumber = reversedNumber*10 + remainder;
        a /= 10;
    }
   return  reversedNumber;
}

int beautifulDays(int i, int j, int k) {
    int count =0;
    for(int a = i;a<= j;a++){
         int b = reverse(a);
         if((abs(a-b)%k) == 0 ){
             count++;
         }
    }
return count;
}

int main()
{
    int i,j,k;
    cin>>i;
    cin>>j;
    cin>>k;
    cout<<beautifulDays(i,j,k);
}

