import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class moveZeros {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String input = br.readLine();
    	
    	int n = input.length();
    	
    	int arr[] = new int[n];
    	
    	int result = 0;
    	
    	for(int i =0;i<n;i++)
    	{
    		arr[i] = Character.getNumericValue(input.charAt(i));
    	}
    

  	  int start = 0;
  	  int end = arr.length - 1;
  	  while (start < end)
  	  {
  	   if (arr[start] == 0 && arr[end] != 0)
  	   {
  		   
  		System.out.println("Entered");  
  	    int temp = arr[start];
  	    arr[start] = arr[end];
  	    arr[end] = temp;
  	    result = result + (end - start);
  	    start++;
  	    end--;
  	    
  	   } else
  	   {
  	    if (arr[start] != 0)
  	     start++;
  	    if (arr[end] == 0)
  	     end--;
  	   }
  	  }
  	
  	
  	System.out.println("Ans is : "+ result);
    	
    	
	}

}
