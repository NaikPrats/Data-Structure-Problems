import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class chemistry {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.parseInt(br.readLine());
		
		ArrayList<String> list =  new ArrayList<>();
		
		HashMap<String,ArrayList<String>> hm =  new HashMap<>();
		
		for(int i=0;i<N;i++)
		{
			String temp = br.readLine();
			String tokens[] =  temp.split("\\s+");
			int k = 2;
			for(int j=0;j<Integer.parseInt(tokens[1]);j++)
			{
				list.add(tokens[k]);
				k++;
				hm.put(tokens[0],list);
				
			}	
		}
		
		String line =  br.readLine();
		
		String token[] = line.split("\\s+");
		
		for(int i=1;i< token.length;i++)
		{
			ArrayList<String> l = new ArrayList<>();
			l = hm.get(token[i]);
			
			
			for(int j=0;j<l.size();j++)
			{
				
				
				
			}
			
			
			
		}
		
		
	}

}
