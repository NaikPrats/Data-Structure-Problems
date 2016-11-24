
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "I am new here";
		char arr[] = input.toCharArray();
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j)
		{
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] =  t;
			i++;
			j--;
		}
		
		input  = input.replaceAll(" ", "%20");
		System.out.println(input);
		
		//System.out.println("new String is : " + new String(arr));
		String number = "12345";
		
		int res=0;
		for(i=0;i<number.length();i++)
		{	
			res = res*10 + number.charAt(i) - '0';	
			
		}
		System.out.println(res);
		
		
		String para = "I am new here in the world";
		String text = "here";
		
		
		int m = para.indexOf(text);
		
		System.out.println(m);
		
		
		
		
		
		
		
		
		
		
	}

}
