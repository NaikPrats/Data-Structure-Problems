import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] grid = new char[n][n];

        for(int i =0;i<n;i++)
        {
            String temp = sc.nextLine();
            grid[i] = temp.toCharArray();
        }
        
        //find level of each '.'
        
        int level =0;
        int maxLevel = 0;
        
        
        for(int i=1 ;i <n-1;i++)
        {
        	for(int j =1;j<n-1;j++)
        	{
        		int row = i;
        		int col = j;
        		
        		if(grid[row][col] == '.')
        		{
        			int left = col-1;
        			int right = col+1;
        			int up = row-1;
        			int down = row+1;
        		
        			while(left>=0 && right<=(n-1) && up >=0 && down <= (n-1))
        			{
        				if((grid[row][left] == '.') && (grid[row][right] == '.') && (grid[up][col] == '.') && (grid[down][col] =='.'))
        					{		
        					
        							if(level == 0)
        							{	
        								level++;
        								if(level > maxLevel)
            							{
            								maxLevel = level;
            							}
            							left--;
            							right++;
            							up--;
            							down--;
        							}//Only do this when diagonal elements are found.
        							else
        							{
        								
        							}
        							
        					}
        			}
        		}
        	}
        }
        
        System.out.println(maxLevel);

        
    }
}