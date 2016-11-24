import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class minCoins
{
    public static void main(String[] args) throws Exception
    {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line = br.readLine();
       StringBuilder buf = new StringBuilder(line);
       
       
       int t = Integer.parseInt(br.readLine());
      
       if(t == 1)
    	   System.out.println(line);
       else
       {
    	   for(int i=0;i<line.length();i++)
    	   {
    		   if((i+t-1) < line.length())
    		   {
    			   char temp  = buf.charAt(i);
    			   buf.setCharAt(i, buf.charAt(i+2));
    			   buf.setCharAt(i+2, temp);
    		   }
    		   i= i+ 2*(t-1);
    	   }
       }
       
       System.out.println(buf);
             
    }

}
