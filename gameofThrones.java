import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class gameofThrones {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans = "YES";
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        int count[] = new int[26];
        for(int i=0;i<inputString.length();i++)
        {
        	 char ch = inputString.charAt(i);
             count[ch-'a']++;

        }
        
        int oddOccur = 0;
        for( int cnt:count )
        {
            if( oddOccur > 1) // more than 1 char should have odd frequency
                ans = "NO";
            if( cnt%2 == 1 )
                oddOccur++;
        }

        
        System.out.println(ans);
        myScan.close();
    }
}