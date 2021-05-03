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
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i =0;i<test;i++){
            int n = scan.nextInt();
            int ar[][] = new int[n][n];
            for(int j =0;j<n;j++){
                for(int k=0;k<n;k++){
                    ar[j][k] = scan.nextInt();
                }
            }
            
            int con[] = new int[n];
            int ball[]=new int[n];
            
            for(int a =0;a<n;a++){
                con[a] = 0;
                ball[a]=0;
                for(int b=0;b<n;b++){
                    con[a] += ar[a][b];
                    ball[a] += ar[b][a];
                }
            }
            Arrays.sort(con);
            Arrays.sort(ball);
            int c =0;
            for(int m =0;m<n;m++){
                if(con[m] != ball[m]){
                    System.out.println("Impossible");
                    break;
                }
                else{
                    c++;
                }
            }
            if(c == n){ System.out.println("Possible");}
           
            
        }
        
        
       
    }
}
