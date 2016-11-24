import java.io.BufferedReader;
import java.io.InputStreamReader;

public class reverseN {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input =  br.readLine();
		StringBuffer buf = new StringBuffer(input);
		int t = Integer.parseInt(br.readLine());
		
		if(t == 1)
		{
			System.out.println(input);
		}
		else if(t > input.length())
		{
			System.out.println(buf.reverse().toString());
		}
		else
		{
			for(int i=0;i<input.length();i++)
			{
				if((i+t-1) < input.length())
				{
				char temp = buf.charAt(i);
				buf.setCharAt(i, buf.charAt(i+t-1));
				buf.setCharAt(i+t-1, temp);
				i+= 2*t-1;
				}
				else
					break;
				
			}
		}
		
	}

}
