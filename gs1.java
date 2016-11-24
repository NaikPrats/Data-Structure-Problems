import java.util.*;
public class gs1 {
	
	
	public static String getTime(int a,int b,int c,int d)
	{
		String res="";
		//Time format is based on (h1h2:m1m2)
		//h1 : 0-2
		//h2 : 0-3
		//m1 : 0-5
		//m2 : 0-9
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		int h1 = 0;
		int h2 = 0;
		int m1 = 0;
		int m2 = 0;
		System.out.println(list);
		int i=0;
		for(i=2;i>=0;i--)
		{
			if(list.contains(i))
			{
				h1 = i;
				list.remove(Integer.valueOf(i));
				System.out.println(list);
				System.out.println("H1 :" + h1);
				break;
			}
		}
		if(i == -1)
		{
			res = "NOT POSSIBLE";
			return res;
		} 
		
		if(h1 == 2)
		{
			
		for(i=3;i>=0;i--)
		{
			if(list.contains(i))
			{
				h2 = i;
				list.remove(Integer.valueOf(i));
				System.out.println(list);
				System.out.println("H2 :" + h2);
				break;
			}
		}
		if(i == -1)
		{
			res = "NOT POSSIBLE";
			return res;
		}
		
		}
		else if (h1 == 1 || h1 == 0)
		{
			for(i=9;i>=0;i--)
			{
				if(list.contains(i))
				{
					h2 = i;
					list.remove(Integer.valueOf(i));
					System.out.println(list);
					System.out.println("H2 :" + h2);
					break;
				}
			}
			if(i == -1)
			{
				res = "NOT POSSIBLE";
				return res;
			}
			
		}
		
		
		for(i=5;i>=0;i--)
		{
			if(list.contains(i))
			{
				m1 = i;
				list.remove(Integer.valueOf(i));
				System.out.println(list);
				System.out.println("m1 :" + m1);
				break;
			}
		}
		if(i == -1)
		{
			res = "NOT POSSIBLE";
			return res;
		} 
		System.out.println(list);
		
		m2 = list.get(0);
		System.out.println("m2 :" + m2);
		
		res = Integer.toString(h1) +  Integer.toString(h2) + ":" +  Integer.toString(m1) +  Integer.toString(m2);
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c = 4;
		int d = 2;
		
		
		String result = getTime(a,b,c,d);

		System.out.println(result);
	}

}
