//Funny String


#include <bits/stdc++.h>

using namespace std;

// Complete the funnyString function below.
string funnyString(string s) {
    int n = s.length();
    char char_array[n + 1];
     strcpy(char_array, s.c_str());
     int ar[n-1];
     reverse(s.begin(), s.end());
     char char_array1[n + 1];
     strcpy(char_array1, s.c_str());
     int ar1[n-1];
     for(int i =0;i<n-1;i++){
       ar[i] = abs(char_array[i] - char_array[i+1]);  
     }
      for(int i =0;i<n-1;i++){
       ar1[i] = abs(char_array1[i] - char_array1[i+1]);  
     }
     int count =0;
     for(int i=0;i<n-1;i++){
     	if(ar1[i] == ar[i]){
     		count++;
		 }
	 }
	 if(count == n-1){
	 	return "Funny";
	}
	else{
		return "Not Funny";
	}
	 
}

int main()
{
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        string s;
        cin>>s;
        cout<<funnyString(s);
    }

    return 0;
}

