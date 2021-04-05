import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main(String args[])
   {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int ar[]=new int[n];
       for (int i=0;i<n;i++)
       {
           ar[i]=scan.nextInt();
       }
       Arrays.sort(ar);
       int pc=ar[n-1];
       int c=1;
       for(int i=0;i<n-1;i++)
       {
           if(ar[i] == pc)
           {
               c++;
           }
       }
       System.out.println(c);
   }
}
