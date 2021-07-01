/*

Print the following pattern

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 

*/



package algorithms;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test {

	public static void main (String[] args) throws java.lang.Exception
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	
	}
	 
	 
}
