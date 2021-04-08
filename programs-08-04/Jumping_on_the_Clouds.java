import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Jumping_on_the_Clouds {
    public static void main (String args []){
        Scanner scan = new Scanner (System.in);
        int n  = scan.nextInt();
        int ar [] =new int[n];
        for(int i=0;i<n;i++){
            ar[i] = scan.nextInt();
        }
        int c=-1;
        for(int i =0;i<n;i++,c++){
            if(i<n-2 && ar[i+2]==0){
                i++;
            }
        }
        System.out.println(c);
           
           
       
    } 
}
