import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class maxStack {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
		
		Stack<Integer> main = new Stack<>();
		Stack<Integer> max = new Stack<>();
		
 		
		for(int i=0;i<N;i++)
		{
			String query = br.readLine();
			
			String tokens[] = query.split(" ");
			//push
			if(Integer.parseInt(tokens[0]) == 1)
			{
				main.push(Integer.parseInt(tokens[1]));
				if(max.isEmpty())
				{
					max.push(Integer.parseInt(tokens[1]));
				}
				else
				{
					if(Integer.parseInt(tokens[1]) > max.peek())
					{
						max.push(Integer.parseInt(tokens[1]));
					}
					else
						max.push(max.peek());
				}
			}
			else if(Integer.parseInt(tokens[0]) == 2)
			{
				main.pop();
				max.pop();
				
			}
			else
			{
				System.out.println(max.peek());
			}
		}
		
	}

}
