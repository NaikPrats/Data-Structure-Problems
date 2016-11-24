import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class simpleTextEditor {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
		
		Stack<String> st = new Stack<>();
 
		for(int i=0;i<N;i++)
		{
			String query = br.readLine();
			String tokens[] = query.split(" ");
			
			
			String current =  "";
			
			//append - Append string w to the end of s.
			if(Integer.parseInt(tokens[0]) == 1)
			{
				current = current + tokens[1];
				st.push(current);
			}
			//delete - Delete the last K characters of s.
			else if(Integer.parseInt(tokens[0]) == 2)
			{
				current = current.substring(0, current.length() - Integer.parseInt(tokens[1]));
				st.push(current);
			}
			//print - Print the kth character of S.
			else if(Integer.parseInt(tokens[0]) == 3)
			{
				System.out.println(current.charAt( Integer.parseInt(tokens[1]) - 1));
			}
			//undo - Undo the last (not previously undone) operation of type 1 & 2
			else if(Integer.parseInt(tokens[0]) == 4)
			{
				st.pop();
				current = st.peek();
			}			
		}
		
		
	}

}
