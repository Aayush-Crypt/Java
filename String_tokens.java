import java.io.*;
import java.util.*;

public class String_tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        
        String[] tokens = s.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        for(String token : tokens){
            System.out.println(token);
        }
        scan.close();
    }
}

