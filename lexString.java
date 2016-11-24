
public class lexString {
	
	
	static String rearrangeWord(String word) {
        char arr[] = word.toCharArray();
        
        int x=-1;
        int y=-1;
        
        for(int i=arr.length-2;i>=0;i--)
        {
        	if(arr[i] < arr[i+1])
        	{
        		x = i;
        		break;
        	}
        	
        }
        
        if(x == -1)
        {
        	return "no answer";
        }
        
        for(int i=arr.length-1;i>x;i--)
        {
        	if(arr[i] > arr[x])
        	{
        		y = i;
        		break;
        	}
        }
        
        //swap characters
        char t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
        
        char[] permute  = new char[arr.length];
        
        for(int i=0;i<x+1;i++)
        {
        	permute[i] = arr[i];
        }
        
        int j=1;
        
        for(int i=arr.length-1;i>x;i--)
        {
        	permute[x+j] = arr[i];
        	j++;
        }
        
        String result =  new String(permute);
        
        return result;

    }
	
	public static void main(String[] args) {
		
	}

}
