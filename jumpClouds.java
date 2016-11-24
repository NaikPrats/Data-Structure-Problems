import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jumpClouds  {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++)
        {
            c[c_i] = in.nextInt();
        }
        
        //Try going +2 till you reach end index
        //If not possible then go one step
        int i=0;
        int result = 0;
        
        while(i!=n-1)
        {
        	if((i+2) <= n-1 && c[i+2]!=1)
        	{
        		i = i+2;
        	}
        	else
        	{
        		i = i+1;
        	}
        	
        	result++;
        	
        }        
        System.out.println(result);
        
    }
}
