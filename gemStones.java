import java.io.*;
import java.util.*;

public class gemStones{

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());

    	ArrayList<String> arr = new ArrayList<>();
    	
    	for(int i=0;i<n;i++)
    	{
    		String temp  = br.readLine();
    		arr.add(temp);
    	}
    	
    	
    	//HashMap<Character, Integer> hm =  new HashMap<Character, Integer>();
    	Set set = new HashSet();
    	
    	char array[] = arr.get(0).toCharArray();
   
    	for(int i=0;i<array.length;i++)
    	{
    		set.add(array[i]);
    	}
    	
    	//System.out.println(hm + "size : " + hm.size());
    	
    	for(int i=0;i<array.length;i++)
    	{
    		System.out.println(array[i]);
    	}
    	int num = 0;
    	
    	
    	Iterator it = set.iterator();
    	  while (it.hasNext()) 
    	  {
    	      // Get element
    	      Object element = it.next();
    	      int count = 0;
    	      for(int j = 0;j<arr.size();j++)
      		{
      			if(arr.get(j).indexOf((char)element) > -1)
      			{    				
      				count++;
      			}
      		}
      		if(count == arr.size())
      		{
      			num++;
      		}
    	  }

    	System.out.println(num);
    	
    	
    }
}