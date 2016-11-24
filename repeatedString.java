import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class repeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        char arr[] = s.toCharArray();
        
        long len = arr.length;
        
        long count  = 0;
        long occur = 0;
        long div = n/len;
        
        for(int i=0;i<s.length();i++)
        {
        	if(arr[i] == 'a')
        	{
        		occur++;
        	}
        }
        
        count = occur*div;
        long mod = n % len;
        
        for(int i=0;i<mod;i++)
        {
        	if(arr[i] == 'a')
        	{
        		count++;
        	}
        }
        
        System.out.println(count);
        
        
    }
}
