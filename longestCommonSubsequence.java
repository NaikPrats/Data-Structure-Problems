import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class longestCommonSubsequence {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	int arr[] = new int[n];
    	
    	for(int i=0;i<n;i++)
    	{
    		arr[i] = Integer.parseInt(br.readLine());
    		
    	}
    	
    	int LIS[] = new int[n];
    	
    	//LIS[i] = longest increasing subseq len ending with L[i]
    	
    	//* Initialize LIS values for all indexes */
        for (int i = 0; i < n; i++ )
           LIS[i] = 1;
        
        for(int i=1;i<n;i++)
        {
        	for(int j=0;j<i;j++)
        	{
        		if(arr[j] < arr[i] && LIS[j]+1 > LIS[i] )
        		{
        			LIS[i] = LIS[j] +1;
        		}
        		
        	}
        }
        int max = 0;
        for (int i = 0; i < n; i++ )
            if ( max < LIS[i] )
               max = LIS[i];

          
        System.out.println(max);
            	
    	
    }
}
