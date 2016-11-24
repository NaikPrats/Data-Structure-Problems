import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class courseratest1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
    	int n = Integer.parseInt(br.readLine());
    	String input[] = new String[n];
    	
    	
    	HashMap<String,Integer> hm =  new HashMap<String,Integer>();
    	
    	for(int i=0;i<n;i++)
    	{
    		input[i] = br.readLine();
    		
    		if(!hm.containsKey(input[i]))
    		{
    			hm.put(input[i], 1);
    		}
    		else
    		{
    			int count = hm.get(input[i]) +1;
    			hm.put(input[i], count);	
    		}
    		
    	}
    	
    	Iterator it = hm.entrySet().iterator();
    	int max = 0;
    	String res = input[0];
    	
        while (it.hasNext()) 
        {
            Map.Entry pair = (Map.Entry)it.next();
            
            if(max <= (Integer)pair.getValue())
            {
            	max = (Integer)pair.getValue();
            	String temp = (String)pair.getKey();
            	
            	if(res.compareTo(temp) <= 0)
            	{
            		res = temp;
            	}
            }
        }
        
    	
    	System.out.println(res);
		
	}

}
