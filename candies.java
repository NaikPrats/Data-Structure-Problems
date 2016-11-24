import java.io.BufferedReader;
import java.io.InputStreamReader;

public class candies {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		int val[] = new int[N];
		
		for(int i=0;i<N;i++)
		{
			val[i] = Integer.parseInt(br.readLine());
			arr[i] = 1;
			
		}
		
		for(int i=1;i<N;i++)
		{
			if(val[i] > val[i-1])
			{
				arr[i] = arr[i-1] + 1;
			}
			
		}
		
		for(int i=N-2;i>=0;i--)
		{
			if(val[i] > val[i+1])
			{
				if(arr[i] < arr[i+1])
					arr[i] = arr[i+1] + 1;
			}
		}
		
		int ans = 0;
		for(int i=0;i<N;i++)
		{
			ans+= arr[i];
		}
		
		System.out.println("Answer is : " + ans);

	}

}
