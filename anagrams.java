import java.util.*;
import java.io.*;


public class anagrams {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++)
        {
            String input =  br.readLine();
            int len = input.length();
            
            HashMap<Character,Integer> set1 = new HashMap<>();
            
            
            if(len%2!=0)
            {
            	System.out.println("-1");
            }
            else
            {
            	int mid = len/2;
            	int end = len;
            	
            	//0-mid-1 && mid-end-1
            	
            	for(int j=0;j<mid;j++)
            	{
            		if(!set1.containsKey(input.charAt(j)))
            		{
            			set1.put(input.charAt(j), 1);
            		}
            		else
            		{
            			int count = set1.get(input.charAt(j)) + 1;
            			set1.put(input.charAt(j), count);
            		}
            	}
            	int cn = 0;
            	for(int k=mid;k<end;k++)
            	{
            		if(set1.containsKey(input.charAt(k)))
            		{
            			if(set1.get(input.charAt(k)) == 1)
            			{
            				set1.remove(input.charAt(k));
            			}
            			else
            			{
            				int count = set1.get(input.charAt(k)) -1;
            				set1.put(input.charAt(k), count);
            			}            			
            		}
            		else
            		{
            			cn++;
            		}
            	}
            	
            	
            	
            	System.out.println(cn);
            	
            }            
        }

	}

}
