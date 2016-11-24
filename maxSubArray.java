import java.io.BufferedReader;
import java.io.InputStreamReader;

public class maxSubArray {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		
		for(int x=0;x<t;x++)
		{
			
		
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			
			String tokens[] = line.split("\\s+");
			
			int arr[] = new int[n];
		
			for(int j=0;j<n;j++)
			{
				arr[j] = Integer.parseInt(tokens[j]);			
			}
			
			//Dynamic programing approach to max subarray problem.
			
			int maxsum = 0;
			int currsum = 0;
			int start = 0;
			int end = 0;
			int noncontiguousSum = 0;
			
			
			int currStart = 0;
			int negCount = 0;
			int maxnegsofar=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				if(Math.abs(arr[i]) == -arr[i])
				{
					negCount++;
					if(arr[i] > maxnegsofar)
					{
						maxnegsofar = arr[i];
					}
				}
			}
			
			
			if(n == negCount)
			{
				System.out.println(maxnegsofar + " " +maxnegsofar);
			}
			else
			{
				for(int i=0;i<n;i++)
			
			{
				currsum =  currsum + arr[i];
				
				if(Math.abs(arr[i]) == arr[i])
				{
					noncontiguousSum+= arr[i];
				}
				
				if(currsum > maxsum)
				{
					end = i;
					maxsum =  currsum;
					start =  currStart;
				}
				
				if(currsum < 0)
				{
					currsum = 0;
					currStart = i+1;
				}
			}
			
			
			System.out.println(maxsum +" "+ noncontiguousSum);
			
			
			}
			
			
		}
	}

}
