import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt();
        if(n < 2){
            System.out.println("yes");
        }
        int ar[] = new int[n];
        for(int i = 0;i<n;i++){
            ar[i] = scan.nextInt();
        }
        
       if(isSor(ar,n)){System.out.println("yes");
        return;}
        
       int i,j; 
    for ( i = 0;     i < n - 1 && ar[i] < ar[i+1]; i++);
    for (j = n-1;   j > 0 && ar[j-1] < ar[j]; j--);
    
    swap(ar, i, j);
    if (isSor(ar,n)) {
        System.out.println("yes\nswap "+ (i+1) + " " + (j+1));
        return;
    }
    int k = i+1, l = j-1;
    while (k < l){
       swap(ar, k++, l--); 
    } 
    if (isSor(ar,n)) {
        System.out.println("yes\nreverse " + (i+1) + " " + (j+1));
        return;
    }
    System.out.println("no");
    
  }
    public static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static boolean isSor(int[] ar,int n) {
    for (int i = 0; i < n-1; ++i) {
        if (ar[i] > ar[i+1]) return false;
    }
    return true;
    }

        
}
