#include <bits/stdc++.h>
#include <cstdlib>
#include<stdio.h>
#include <cstdio>

using namespace std;

vector<string> split_string(string);


void catAndMouse(int x, int y, int z) {
    if(abs(x-z)< abs(y-z)){
        cout<<"Cat A"<<endl;
    }
    else if(abs(y-z)<abs(x-z)) {
        cout<<"Cat B"<<endl;
    }
    else {
        cout<<"Mouse C"<<endl;
    }

}

int main()
{
   int number_of_queries;
   int cat1;
   int cat2;
   int mouse;
   cin>>number_of_queries;
   for(int i =0 ;i<number_of_queries;i++){
       cin>>cat1;
       cin>>cat2;
       cin>>mouse;
        catAndMouse(cat1,cat2,mouse);
      
       
   } 
}

