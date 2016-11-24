import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class twoStrings {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
		
		for(int i=0;i<2*N;i++)
		{
			
			String input1 = br.readLine();
			String input2 = br.readLine();
			int j=0;
			
			for(j=0;j<input2.length();j++)
			{
				if(input1.indexOf(input2.charAt(j)) > -1)
				{
					System.out.println("YES");
					break;
				}
			}
			if(j == input2.length())
			{
				System.out.println("NO");
			}
				
		}
		
		

	}

}
