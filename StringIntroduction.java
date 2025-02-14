import java.io.*;
import java.util.*;

public class StringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length();
        int b = B.length();
        System.out.println(a+b);
        
        int c = Math.min(a, b);
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        String A1 = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String A2 = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(A1+" "+A2);
    }
}



