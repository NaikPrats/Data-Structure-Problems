
public class insertionSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,1,3,6,2};
		
		int j=0;
		for(int i= 1;i<a.length;i++)
		{
			int key = a[i];
			
			for(j=i-1;j>=0;j--)
			{
				if(a[j] > key)
				{
					a[j+1] = a[j];
					
				}
				
 			}
			a[j+1] = key;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
