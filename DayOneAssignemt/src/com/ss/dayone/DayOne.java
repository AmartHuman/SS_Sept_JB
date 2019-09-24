/*
 * Alfredo Martinez
 */

package com.ss.dayone;

public class DayOne {

	public static void main(String[] args) {
		

			
		System.out.println("1)");
				//Loop for pattern 1
				for(int x = 0; x < 5;x++)
				{
					for(int y = 0; y<x;y++)
						System.out.print("*");
					
					System.out.println();
					if(x+1 >= 5)
						System.out.println(".........");
				}
				
				
				
				System.out.println();
				System.out.println("2)");
				//Loop for Pattern 2
				System.out.println();
				System.out.println("..........");
				for(int x = 4; x > 0; x--)
				{
					for(int y = 0; y < x;y++)
						System.out.print("*");
					
					System.out.println();
				}
				
				
				
				System.out.println();
				System.out.println("3)");
				//Loop for Pattern 3 
				for(int x = 0; x <= 4; x++)
				{
					
					for(int y = x; y < 6; y++)
						System.out.print(" ");
					
					
					for(int z = 1; z <=(2*x-1); z++)
					   System.out.print("*");	
					
					System.out.println();
				}
				System.out.println("...........");
				
				
				System.out.println();
				System.out.println("4)");
				//Loop for Pattern 4 
				System.out.println("............");
				for(int x = 4; x > 0; x--)
				{
					
					for(int y = x; y < 6; y++)
						System.out.print(" ");
					
					
					for(int z = 1; z <=(2*x-1); z++)
					   System.out.print("*");	
					
					System.out.println();
				}

	}

}
