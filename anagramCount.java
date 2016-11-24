import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class anagramCount {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		ArrayList<String> list =  new ArrayList<>();
		
		
		for(int i=0;i<t;i++)
		{
			String original = br.readLine();
			
	        char[] chars = original.toCharArray();
	        Arrays.sort(chars);
	        String sorted = new String(chars);
	        if(!list.contains(sorted))
	        	list.add(sorted);	
		}
		
		
		System.out.println(list.size());
		
	}
}
