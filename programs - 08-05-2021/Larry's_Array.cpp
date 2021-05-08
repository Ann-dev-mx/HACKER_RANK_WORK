#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

void suffle(int arr[],int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = arr[j+2];
        arr[j+2] = temp;
}

void sort(int arr[],int n) {
    for (int i=0; i<n-2; i++){
            for (int j=n-2-1; j>=i; j--){
                while (arr[j]>arr[j+1]|| arr[j]>arr[j+2]) {
                    suffle(arr,j);
                }
            }
        }
}

int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        int ar[n];
        for(int k =0;k<n;k++){
            cin>>ar[k];
        }
        sort(ar,n);
        if(ar[n-2]<ar[n-1]){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
    }
    
    return 0;
}


