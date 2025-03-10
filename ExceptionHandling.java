import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a/b;
            System.out.println(result);   
        } catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");            
        } catch(java.util.InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        } finally{
            sc.close();
        }
    }
}