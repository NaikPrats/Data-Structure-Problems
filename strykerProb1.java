import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class strykerProb1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//int n =  sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		
		//System.out.print(n);
		String input1 = null;
		String input2 = null;
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		input1 = br.readLine();
		input2 = br.readLine();
		
		
		String tokens1[] = input1.split("\\s+");
		String tokens2[] = input2.split("\\s+");
		
		for(int i =0;i<n;i++)
		{
			arr1[i] = Integer.parseInt(tokens1[i]); 
			arr2[i] = Integer.parseInt(tokens2[i]); 
		}
		
		HashMap<Integer, Integer> array1 = new HashMap<>();
		HashMap<Integer, Integer> array2 = new HashMap<>();
		
		for(int i = 0;i<n;i++)
		{
			array1.put(arr1[i], i);
			array2.put(arr2[i], i);
		}
		int diff[] =  new int[n];
		
		for(int i=0;i<n;i++)
		{
			diff[i] = Math.abs(i - array2.get(arr1[i]));
		}
		int min = diff[0];
		int minIndex = 0;
		for(int i=0;i<n;i++)
		{
			if(diff[i] < min)
			{
				min = diff[i];
				minIndex = i;
			}
			else if(diff[i] == min)
			{
				if(arr1[i] < arr1[minIndex])
				{
					minIndex = i;
				}
			}
		}
		System.out.println(arr1[minIndex]);
		
	}

}
