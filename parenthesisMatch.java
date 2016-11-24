import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class parenthesisMatch {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcaseno = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		
		Stack<Character> st = new Stack<>();
		boolean result = true;
    
		for(int i =0;i<input.length();i++)
		{
			if(input.charAt(i) == '(')
				st.push(input.charAt(i));
			else if(input.charAt(i) == '{')
				st.push(input.charAt(i));
			else if(input.charAt(i) == '[')
				st.push(input.charAt(i));
			else if(input.charAt(i) == ')')
			{
				if(!st.isEmpty() &&st.pop() != '(')
					{result  =  false;
					
					 break;
					}
				
			}
			else if(input.charAt(i) == ']')
			{
				if(!st.isEmpty() &&st.pop() != '[')
				{result  =  false;
				
				 break;
				}
			}
			else if(input.charAt(i) == '}')
			{
				
				if(!st.isEmpty() && st.pop() != '{')
				{result  =  false;
				
				 break;
				}
			}
		}
		
		System.out.println(result);
    
    
    }    
}