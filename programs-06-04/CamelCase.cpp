#include <bits/stdc++.h>

//CamelCase

using namespace std;

// Complete the camelcase function below.
int camelcase(string s) {
    int count =1;
    int n = s.length();
    char char_array[n + 1];
    strcpy(char_array, s.c_str());
    
    for(int i =0;char_array[i] != '\0';i++){
        if(char_array[i]>= 65 && char_array[i] <= 90){
            count++;
        }
    }
return count;
}

int main()
{
 string s;
 cin>>s;
 cout<<camelcase(s);
}

