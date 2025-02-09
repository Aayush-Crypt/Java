import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializer{

static int B;
static int H;
static boolean flag;
static{
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    flag = true;
    try{
        if((B<=0 || B>100) || (H<=0 || H>100)){
            flag = false;
            throw(new Exception("java.lang.Exception: Breadth and height must be positive"));
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

