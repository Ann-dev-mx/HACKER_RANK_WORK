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
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int size_array,no_queries,no_rotation;
        
        size_array = scan.nextInt();
        no_rotation = scan.nextInt();
        no_queries = scan.nextInt();
        
        int a[] = new int[size_array];
        for(int i =0;i<size_array;i++){
            a[i] =scan.nextInt();
        }
        for(int i=0;i<no_queries;i++){
          int val = scan.nextInt();
          System.out.println(a[(size_array-(no_rotation%size_array)+val)%size_array]);  
        }
       
    }
}

