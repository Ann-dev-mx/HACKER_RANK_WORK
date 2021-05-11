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
    public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner(System.in);
       String s1 = scan.next();
       String s2 = scan.next();
       int l = scan.nextInt();
       
    
       int c =0;
       for(int i = 0;i<Math.min(s1.length(),s2.length());i++){
           if(s1.charAt(i) == s2.charAt(i)){
               c++;
           }
           else{
               break;
           }
       }
       int l1 = Math.max(s1.length(),s2.length());
       int l2= Math.min(s1.length(),s2.length());
       if((l1+l2-l)<0){
            System.out.println("Yes");
    }
    else if((l1+l2-l-c)<0){
            System.out.println("Yes");
    }
    else if(Math.abs(l1-c)<= l){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
}
}
