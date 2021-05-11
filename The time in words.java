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
        int h = scan.nextInt();
        int m = scan.nextInt();
        String hours[] = {"zero","one","two","three","four","five","six","seven",          "eight","nine","ten","eleven","twelve"};
        String min[] = {"zero","one","two","three","four","five","six","seven",          "eight","nine","ten","eleven","twelve","thirteen","fourteen",
           "fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one",
"twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven",
"twenty eight","twenty nine", "thirty"};
        
        if(m == 0){
            System.out.println(hours[h].trim() + " o' clock");
        }
        else if(m <= 30){
            if(m == 15){
                System.out.println("quarter past " + hours[h].trim());
                
            }
            else if(m == 30){
                System.out.println("half past " + hours[h].trim());
            }
            else{
                System.out.println(min[m].trim()+" minutes past "+hours[h].trim());
            }
        }
        else if(m > 30 && h < 12 && m!=60){
            if(m == 45){
                System.out.println("quarter to " +hours[h+1].trim());
            }
            else{
                 System.out.println((min[60-m].trim())+" minutes to "+hours[h+1].trim());
            }
        }
        else if (m == 60){
            if(h<12){
                System.out.println(hours[h+1].trim() + " o' clock");
            }
            else{
                System.out.println(hours[1].trim() + " o' clock");
            }
        }
        else{
            if(m == 45){
                System.out.println("quarter to one");
            }
            else{
                 System.out.println((min[60-m].trim())+" minutes to one");
            }
        }
    }
}
