
public class balancedBT {

	public static int binarySearch(int A[],int start,int end,int k)
	{
		
			int mid = (start + end)/2;
		
			if(A[mid] == k)
			{
				return mid;
			}
			
			if(A[mid] > A[start])
			{
				if(A[k] <= A[mid] && A[k] >= A[start])
					return binarySearch(A,start,mid-1,k);
				else
					return binarySearch(A,mid+1,end,k);
			}
			else 
			{
				if(A[k] >= A[mid] && A[k] <= A[end])
					return binarySearch(A,mid+1,end,k);
				else
					return binarySearch(A,start,mid-1,k);
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {5,6,7,1,2,3,4};
		
		int elem = 7;
		
		int index = binarySearch(A,0,6,elem);
		
		System.out.println(index);
		
	}

}
