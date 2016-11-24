
public class rectangularofOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the rectangule of all 1s...consider the boundary conditions
		// find multiple rectangles of all 1s..make all zero for first rectangle and then proceeed.
		int arr[][] = {
						{0,0,0,0,0},
						{0,0,0,0,0},
						{0,1,1,1,0},
						{0,1,1,1,0}
					  };

	//System.out.println(arr[0].length);
		int tlX = 0;
		int tlY = 0;
		int wid = 0;
		int hei=0;
		
		boolean done = false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				
				if(arr[i][j] == 1 && !done)
				{
					tlX = i;
					tlY = j;
					done = true;
					
					while((j < arr[0].length) && arr[i][j] == 1)
					{
						j++;
						wid++;
					}
					
					j = tlY;
					while( (i < arr.length) && arr[i][j] == 1)
					{
						i++;
						hei++;
					}
					i = tlX;
					
					break;
				}
			}
			
			if(done)
				break;
		}
		
		System.out.println("topLEftX : " +tlX+ "topLeftY : " + tlY + "height :" + hei + "wid : " + wid );
		
		/*int tlX = 0;
		int tlY = 0;
		int wid = 1;
		int hei=1;
		int count = 0;
		boolean done = false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				
				if(arr[i][j] == 1)
				{
					tlX = i;
					tlY = j;
					count++;
					
					
					j = j+1;
					while((j < arr[0].length) && arr[i][j] == 1)
					{
						wid++;
						arr[i][j] = 0;
						j++;
						
					}
					
					j = tlY;
					
					i=i+1;
					while( (i < arr.length) && arr[i][j] == 1)
					{
						hei++;
						arr[i][j] = 0;
						i++;
						
					}
					i = tlX;
					j = tlY;
					arr[i][j] = 0;
					
					i=0;
					j=0;
					
					break;
				}
			
				
			}
		}
		
		System.out.println(count);
		*/
	}

}
