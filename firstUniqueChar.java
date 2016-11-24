import java.util.*;
public class firstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aabbccdde";
		//Answer should be b.
		
		HashMap<Character,Integer> hm = new LinkedHashMap<>();
		

		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			if(!hm.containsKey(ch))
			{
				hm.put(ch, 1);
			}
			else
			{
				int count  = hm.get(ch) + 1;
				hm.put(ch, count);
			}
		}
		
		Iterator it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			if((int)pair.getValue() ==1)
			{
				System.out.println((char)pair.getKey());
				break;
			}
		}
		
		
	}

}
