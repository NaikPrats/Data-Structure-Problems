import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class kthZero1
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
		ArrayList<Integer> indexList = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(token2[i]);
			array.put(i, arr[i]);
			if(arr[i] == 0)
			{
				indexList.add(i);
			}
		}
			
		for(int i=0;i<m;i++)
		{
			String query = br.readLine();
			String token3[] = query.split(" +");
			int k = Integer.parseInt(token3[1]);
			if(Integer.parseInt(token3[0]) == 1)
			{
				/*System.out.println("case 2");
				System.out.println(array);
				System.out.println(indexList);*/
				if(indexList.size() < k)
				{
					
					System.out.println("NO");
				}
				else
				{
					System.out.println(indexList.get(k-1));
				}
				
			}
			else
			{	//2 p x
				//Index p , Value X
				//System.out.println("I am in two case");
				int p = Integer.parseInt(token3[1]);
				int x = Integer.parseInt(token3[2]);
				
				
				if((x!=0) && array.get(p) == 0 )
				{
					//System.out.println("Removing :" + p);
					indexList.remove(new Integer(p));
				}
				else if(x == 0)
				{
						
					indexList.add(p);
					Collections.sort(indexList);
				}
				array.put(p,x);
				
				/*System.out.println("case 2");
				System.out.println(array);
				System.out.println(indexList);*/
			}
			
		}
	}
}
