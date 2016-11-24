import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class anagramsCount {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.parseInt(br.readLine());
		
		HashMap<String,Integer> hm  = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<N;i++)
		{
			
			String original = br.readLine();
	        char[] chars = original.toCharArray();
	        Arrays.sort(chars);
	        String sorted = new String(chars);
			
	        if(!hm.containsKey(sorted))
	        		hm.put(sorted, 1);
	        else
	        {
	        	int count = hm.get(sorted) + 1;
	        	hm.put(sorted, count);
	        }	
		}
		
		int res=0;
		Iterator it = hm.entrySet().iterator();
	    
		while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        
	        if((int)pair.getValue() > 1)
	        {
	        	res = res + (int)pair.getValue();
	        }
	    }	
		System.out.println("number os anagrams : " + res);
	}

}
