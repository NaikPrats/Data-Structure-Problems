
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class loveletterMystery {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i=0;i<n;i++)
    	{
    		String temp = br.readLine();
    		
    		char arr[] = temp.toCharArray();
    		int start = 0; int end = arr.length-1;
    		int sum=0;
    		while(start<end)
    		{
    			int diff = arr[start] - arr[end];
    			sum = sum + Math.abs(diff);
    			
    			start++;
    			end--;
    		}
    		
    		System.out.println(sum);
    	}
    	
    	
    }
}