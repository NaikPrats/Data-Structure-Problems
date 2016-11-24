import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class minTowerProblem {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
    	String line1 = br.readLine();
    	String line2 =  br.readLine();
    	
    	
    	
    	String tokens[] = line1.split(" ");
    	
    	int n = Integer.parseInt(tokens[0]);
    	int k = Integer.parseInt(tokens[1]);

    	ArrayList<Integer> arr = new ArrayList<>();
    	
    	tokens = line2.split(" ");
    	
    	for(int i=0;i<n;i++)
    	{
    		arr.add(Integer.parseInt(tokens[i]));
    	}
    	
    	Collections.sort(arr);
    	
    	//System.out.println(arr);
    	
    	int start=0;
    	
    	int mover=1;
    	int count=0;
    	int next=0;
    	
    	while(!arr.isEmpty())
    	{
    		
    		while( (mover < arr.size()) && (arr.get(mover)-arr.get(start)) <= k )
    		{
    			mover++;
    		}
    		
    		count++;
    		
    		//System.out.println("Mover is : " +  mover);
    		next = mover;
    		
    		while((next < arr.size()) && ((arr.get(next) -  arr.get(mover-1)) <= k))
    		{
    			next++;
    		}
    		//System.out.println("Next position is:" + next);
    		for(int x=0;x<next;x++)
    		{
    			arr.remove(0);
    		}
    		
    		mover = 1;  
    		//System.out.println("Count is:" + count + "Array is :" + arr);
    	}
    	
    	
    	System.out.println(count);
    	
	}

}
