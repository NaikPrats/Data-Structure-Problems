import java.io.BufferedReader;
import java.io.InputStreamReader;

public class knapsack {
	
	static int max(int a, int b) { return (a > b)? a : b; }

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line1 = br.readLine();
		String line2 = br.readLine();
		
		String tokens[] = line1.split("\\s+");
		
		int n = Integer.parseInt(tokens[0]);
		int Sum = Integer.parseInt(tokens[1]);
		tokens = line2.split("\\s+");
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(tokens[i]);			
		}
		
		int K[][] = new int[n+1][Sum+1];
	      
	     // Build table K[][] in bottom up manner
	     for (int i = 0; i <= n; i++)
	     {
	         for (int w = 0; w <= Sum; w++)
	         {
	             if (i==0 || w==0)
	                  K[i][w] = 0;
	             else if (arr[i-1] <= w) //if weight is lesser than the weight in consideraation IMP
	                   K[i][w] = max(arr[i-1] + K[i][w-arr[i-1]],  K[i-1][w]);//IMP here K[i-1][w-arr[i-1]] would give the without repetition result.
	             else
	                   K[i][w] = K[i-1][w];
	         }
	      }
	      
	      int answer =  K[n][Sum];
		
	      
	      System.out.println("Solution is : " + answer);
		
	}

}
