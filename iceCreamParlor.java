import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class iceCreamParlor {


    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for(int i=0;i<t;i++)
    	{
    		int m = Integer.parseInt(br.readLine());
    	    int n = Integer.parseInt(br.readLine());
    	    
    	    String temp = br.readLine();
    		
    	    char tm[] = temp.toCharArray();
    	    int arr[] = new int[tm.length];
    	    
    	   
    	    for(int j=0;j<n;j++)
    	    {
    	    	arr[i] = (Character.getNumericValue(tm[j]));
    	    	     	
    	    }
    	   int min = 0;
    	   int max = arr.length-1;
    	   int sum = (arr[min] + arr[max]);
    	   
    	   while(sum!= m)
    	   {
    		   if(sum > m)
    		   {
    			   max--;
    		   }
    		   else
    		   {
    			   min++;
    		   }	   
    		   sum = arr[min] + arr[max];
    	   }
    	   
    	   System.out.println(arr[min] + " " + arr[max]);
    		
    	}
    	
    }
	
}
