import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(c[i]))
            {
                hm.put(c[i],1);   
                System.out.println("Added first time:" + c[i]);
                System.out.println(hm);
            }
            else
            {
                int count  = hm.get(c[i]);
                hm.put(c[i],++count);
                System.out.println("Updated:" + c[i]);
                System.out.println(hm);
            }
        }
        
        int numPair = 0;
        Iterator it = hm.entrySet().iterator();
        
        while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        int num = (Integer)pair.getValue();
        System.out.println(num);
        numPair = numPair + num/2;       
        }        
        //System.out.println(numPair);
    }
}
