import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class kthZero 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1=null;
		String input2=null;
				
		input1 = br.readLine();
		input2 = br.readLine();
		
		String token1[] = input1.split("\\s+");
		String token2[] = input2.split("\\s+");
		
		int n = Integer.parseInt(token1[0]);
		int m = Integer.parseInt(token1[1]);
		
		int arr[] = new int[n];
		HashMap<Integer, Integer> array = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(token2[i]);
			array.put(i, arr[i]);
		}
			
		for(int i=0;i<m;i++)
		{
			String query = br.readLine();
			String token3[] = query.split(" +");
			if(Integer.parseInt(token3[0]) == 1)
			{
				//locate Kth Zero
				//System.out.println("I am in one case");
				int k = Integer.parseInt(token3[1]);
				
				ArrayList<Integer> temp = new ArrayList<Integer>();
			
				for(int j =0;j<array.size();j++)
				{
					if(array.get(j) == 0)
					{
						temp.add(j);
					}
				}
				
				if(temp.size() < k)
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println(temp.get(k-1));
				}			
			}
			else
			{	//2 p x
				//store x value at position p
				//System.out.println("I am in two case");
				int p = Integer.parseInt(token3[1]);
				int x = Integer.parseInt(token3[2]);
				array.put(p,x);			
			}
		}
	}
}
