import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class bloombergCodeon {

	
	public static boolean isPalindrom(String input)
	{
		StringBuffer bf = new StringBuffer(input);	
		StringBuffer rev = bf.reverse();
		
		return input.equals(rev.toString());
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();	
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(int i=0;i<t;i++)
		{
			arr.add(br.readLine());
			
			if(!isPalindrom(arr.get(i)))
			{
				if(!hm.containsKey(arr.get(i)))
					hm.put(arr.get(i), 1);
				else
				{
					int count = hm.get(arr.get(i)) +1;
					hm.put(arr.get(i), count);		
				}
			}	
		}
		int ans = 0;
		for(int i=0;i<arr.size();i++)
		{
			String rev  = new StringBuilder(arr.get(i)).reverse().toString();
			
			//System.out.println(rev);
			
			if(hm.containsKey(arr.get(i)) && hm.containsKey(rev))
			{
				ans++;
				int count = 0;
				
				if(hm.get(rev) == 1)
				{
					hm.remove(rev);
				}
				else
				{
				    count = hm.get(rev) -1;
				}
				
				if(hm.get(arr.get(i)) == 1)
				{
					hm.remove(arr.get(i));
				}
				else
				{	
					count = hm.get(arr.get(i)) -1;
					hm.put(arr.get(i), count);
				}	
				
				
			}
			
		}
		
		if(hm.size() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			System.out.println(-1);
		}
		
		
		
	}

}
