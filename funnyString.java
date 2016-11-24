import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class funnyString {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	ArrayList<String> arr = new ArrayList<>();
    	
    	for(int i=0;i<n;i++)
    	{
    		String temp = br.readLine();
    		arr.add(temp);
    	}
    	
    	
    	for(int i=0;i<n;i++)
    	{
    		String t = arr.get(i);
    		char array[] = t.toCharArray();
    		
    		String rev = "";
    		
    		for(int j = array.length-1;j>=0;j--)
    		{
    			rev = rev+ array[j];
    		}  
    		
    		System.out.println("Original String : " + t);
    		System.out.println("reversed String : " + rev);
    		for(int k=0;k<t.length()-1;k++)
    		{
    			System.out.println((Math.abs(t.charAt(k+1)-t.charAt(k))));
    			System.out.println((Math.abs(rev.charAt(k+1)-rev.charAt(k))));
    			
    			if(Math.abs((t.charAt(k+1)-t.charAt(k))) != Math.abs((rev.charAt(k+1)-rev.charAt(k))))
    			{
    				System.out.println("Not Funny");
    				break;
    			}
    			
    			if(k == t.length()-2)
    			{
    				System.out.println("Funny");
    			}
    		}
    	
    	}
    	
    }
}