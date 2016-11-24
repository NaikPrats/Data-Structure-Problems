import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class manasaAndStones {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
    	int t = Integer.parseInt(br.readLine());
    	
    	
    	
    	for(int i=0;i<t;i++)
    	{
    		int n = Integer.parseInt(br.readLine());
    		int a = Integer.parseInt(br.readLine());
    		int b = Integer.parseInt(br.readLine());
    		
    		if(a == b)
    		{
    			System.out.println(a*(n-1));
    			continue;
    		}
    		
    		ArrayList<Integer> arr =  new ArrayList<>();
    		int start = 0;
    		int end = 0;
    		if(a < b)
    		{
    			start = a*(n-1);
    			end   = b*(n-1);
    		}
    		else
    		{
    			start = b*(n-1);
    			end   = a*(n-1);
    		}
    		
    		int diff = Math.abs(b-a);
    		arr.add(start);
    		
    		for(int x = start+diff ; x<end ; x= x + diff)
    		{
    			arr.add(x);
    		}
    		
    		arr.add(end);
    		
    		for(int m=0;m<arr.size();m++)
    		{
    			
    			System.out.print(arr.get(m)+ " ");
    		}
    		
    		System.out.println();
    	}

	}

}
