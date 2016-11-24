import java.io.BufferedReader;
import java.io.InputStreamReader;

public class countingMistakes {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		String tokens[] = input.split(" ");
		int len = tokens.length;
		int arr[] = new int[len];
		
		for(int i=0;i<len;i++)
		{
			arr[i] = Integer.parseInt(tokens[i]);
		}
		
		int curr = 0;
		int next = 1;
		int ans = 0;
		if(arr[curr]!=1)
		{
			ans++;
		}
		while(next<len)
		{
			if(arr[next]!= (arr[curr] + 1))
			{
				ans++;
			}
			
			next++;
			curr++;
		}
		
		System.out.println("mistakes : " + ans);
		
	}

}
