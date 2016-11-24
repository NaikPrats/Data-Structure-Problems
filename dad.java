import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dad {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcaseno = Integer.parseInt(br.readLine());
		for (int i = 0; i < testcaseno; i++) {
			Stack<Character> x = new Stack<>();
			String k = br.readLine();
			boolean flag=true;
			for (int p = 0; p < k.length(); p++) {
				if (k.charAt(p) == '{') {
					x.push('}');
				} else if (k.charAt(p) == '[') {
					x.push(']');
				} else if (k.charAt(p) == '(') {
					x.push(')');
				} else if (k.charAt(p) == ')') {
					if (x.isEmpty()||x.pop() != ')') {
						System.out.println("NO");
						flag=false;
						break;
					}
				} else if (k.charAt(p) == ']') {
					if (x.isEmpty()||x.pop() != ']') {
						System.out.println("NO");
						flag=false;
						break;
					}
				} else if (k.charAt(p) == '}') {
					if (x.isEmpty()||x.pop() != '}') {
						System.out.println("NO");
						flag=false;
						break;
					}
				}
			}
			
			if (flag!=false){
				System.out.println("YES");
			}

		}
	}
}