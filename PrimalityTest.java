import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        
        BigInteger num = new BigInteger(n);
        int certainty= 10000;
        if (num.isProbablePrime(certainty)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        
    }
}
