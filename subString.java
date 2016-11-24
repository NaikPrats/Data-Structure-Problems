import java.io.BufferedReader;
import java.io.InputStreamReader;

public class subString {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String string = br.readLine();
    	int length = string.length();
    	String sub = "";
    	long sum = 0;
    	for(int c = 0 ; c < length ; c++ )
        {
           for(int i = 1 ; i <= length - c ; i++ )
           {
              sub = string.substring(c, c+i);
              sum = sum+ Long.parseLong(sub);
           }
        }
    	
    	sum = sum %1000000007;
    	System.out.println(sum);
    	
	}

}
