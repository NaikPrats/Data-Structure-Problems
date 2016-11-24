import java.util.*;


public class lastSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "ba";
		String result = ""+input.charAt(0);		
		int j=0;
		
		for(int i=0;i<input.length();i++)
		{
			for(j=i+1;j<input.length();j++)
			{
				if(input.charAt(j) > input.charAt(i))
				{
					result = input.substring(i, j+1);
				}
				else
				{
					break;
				}
			}
		}
		
		System.out.println("last substring : " + result);
		
		

	}

}
