
public class equilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4 ,2 ,0 ,1 ,4, 0, 1};
		
		
		int leftSum = 0;
		int rightSum = 0;
		for(int i=0;i<arr.length;i++)
		{
			
			rightSum = rightSum + arr[i];
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			leftSum =  leftSum + arr[i];
			rightSum = rightSum - arr[i];
			
			if(leftSum == rightSum)
			{
				System.out.println("Equilibrium index = " + i);
				break;
			}
	
		}

	}

}
