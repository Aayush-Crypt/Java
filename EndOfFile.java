import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(sc.hasNext()){
            String data = sc.nextLine();
            i=i+1;
            System.out.println(i+" "+ data);
        }
    }
}
