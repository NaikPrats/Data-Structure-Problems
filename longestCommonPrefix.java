import java.util.*;


public class longestCommonPrefix {

	public static String prefixMatch(String input1,String input2)
	{
		String result ="";
		for(int i=0,j=0;i<input1.length() && j<input2.length();i++,j++)
		{
			if(input1.charAt(i) != input2.charAt(j))
			{
				break;
			}
			result = result + input1.charAt(i);
		}
		
		
		return result;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String arr[] = {"geeksforgeeks", "geeks","geek", "xeezer"};
		String prefix = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			prefix = prefixMatch(prefix,arr[i]);
		}
		
		System.out.println("Longest common prefix : " + prefix);
	}

}
