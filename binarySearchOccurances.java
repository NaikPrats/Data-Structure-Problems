
public class binarySearchOccurances {

	public static int binarySearch(int arr[],int start,int end,int elem)
	{
		int mid = (start+end)/2;
		
		if(arr[mid] == elem)
		{
		    int count = 1;
			int i=mid+1;
			while(i<arr.length)
			{
				if(arr[i] == elem)
					count++;
				i++;
			}
			i =  mid-1;
			while(i>=0)
			{
				if(arr[i] == elem)
					count++;
				i--;
			}
			
			return count;
			
		}
		else if(arr[mid] > elem)
		{
			return binarySearch(arr,start,mid-1,elem);
		}
		else if(arr[mid] < mid)
		{
			return binarySearch(arr,mid+1,end,elem);
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,5,7,7,7,7,7,9};
		
		int start = 0;
		int end = arr.length;
		int ans = binarySearch(arr,0,end-1,7);

		System.out.println(ans);
	}

}
