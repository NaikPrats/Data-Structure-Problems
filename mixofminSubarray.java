import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class mixofminSubarray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
    	String input = br.readLine();   	
    	int n = input.length();
    	int arr[] = new int[n];	
    	int result = 0;
    	
    	int k = 1;
    	
    	for(int i =0;i<n;i++)
    	{
    		arr[i] = Character.getNumericValue(input.charAt(i));
    	}
    	
    	ArrayList<Integer> minArr = new ArrayList<>();
    	
    	for(int i=0;i<=n-k;i++)
    	{
    		int min = arr[i];
    		
    		for(int j=i;j<k;j++)
    		{
    			if(min > arr[j])
    			{
    				min = arr[j];
    			}
    		}
    		
    		minArr.add(min);
    	}
    	int max = minArr.get(0);
    	for(int i=0;i<minArr.size();i++)
    	{
    		if(max < minArr.get(i))
    		{
    			max = minArr.get(i);
    		}		
    	}
    	
    	
    	System.out.println("Answer : " + max);
	}

}
