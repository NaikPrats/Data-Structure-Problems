import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;



public class abc {

public static void abc() throws IOException {

	int integerMaxOccured = -1 ; 

	int maxSubKnown  = 0 ;

	int co=0;

	int count=0;

	ArrayList<String> eachStudent = new ArrayList<String>();

	HashMap<Integer, Integer> hmap = new HashMap<>();

	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

	String in = br.readLine();

	String[] line1 =  in.split(" ");

	int n = Integer.parseInt(line1[0]);

	int m=   Integer.parseInt(line1[1]);

	for (int i=0;i<n;i++){

			String eachLine = br.readLine();

			eachStudent.add(eachLine);

	}

 

	for(int i=0;i<n;i++){

		for(int j=i+1; j<n;j++){

				String s1 = eachStudent.get(i);

				String s2 = eachStudent.get(j);


				for(int k=0;k<m;k++){

					char p = s1.charAt(k);

					char q = s2.charAt(k);

					if(p=='0' && q=='0'){

						continue;

					}else{

						count++;

					}

				}

if(hmap.containsKey(count)){

co = hmap.get(count);

co++;

hmap.put(count, co);

if(co>integerMaxOccured){

integerMaxOccured=co;

maxSubKnown = count;

}

}else{

hmap.put(count,1);

integerMaxOccured=1;

maxSubKnown = count;

}

}

}


System.out.println(maxSubKnown);

System.out.println(integerMaxOccured);


}



public static void main(String[] args) throws IOException {

abc();

}



}