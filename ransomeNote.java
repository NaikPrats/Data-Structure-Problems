import java.util.*;

public class ransomeNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> hm =  new HashMap<>();
        
        for(int i=0;i<magazine.length();i++)
        {
            if(!hm.containsKey(magazine.charAt(i)))
            {
                hm.put(magazine.charAt(i),1);
            }
            else
            {
                int count = hm.get(magazine.charAt(i))+1;
                hm.put(magazine.charAt(i),count);
            }
        }
        
        for(int i=0;i<ransomNote.length();i++)
        {
            if(!hm.containsKey(ransomNote.charAt(i)))
            {
                return false;
            }
            else
            {
                int cn = hm.get(ransomNote.charAt(i));
                System.out.println("Cnt for  " + ransomNote.charAt(i) + " "+ cn );
                cn = cn-1;
                System.out.println("now cnt is : " + cn);
                
                if(cn == 0)
                {
                    hm.remove(ransomNote.charAt(i));
                }
                else
                {
                	hm.put(ransomNote.charAt(i),cn);
                }
            }
        }
        
        return true;
        
        
        
    }
    
    public static void main(String[] args) {
		
    	String t = "fihjjjjei";
    	String m = 	"hjibagacbhadfaefdjaeaebgi";

    	System.out.println(canConstruct(t,m));
	}
}