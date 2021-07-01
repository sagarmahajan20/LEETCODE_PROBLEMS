/*
Print the pattern
    *
   **
  ***
 ****
*****


*/


public static void main (String[] args) throws java.lang.Exception
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			int t=n-i;
			for(int j=1; j<=t; j++)
			{
				
				System.out.print(" ");
				
			}
			for(int j=t+1; j<=n; j++)
			{
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	
	}
	 
