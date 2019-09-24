/*
 * Alfredo Martinez
 */

package com.ss.daytwo;

import java.util.*;

public class PartOne {

	
	
	public static void main(String[] args) {
		
		Integer sum = 0;
	    
	    Integer count = 0;
		
		Scanner values = new Scanner(System.in);
		
		System.out.println("Enter in a value to add or type 0 to exit \n");
		while(true)
		{
			System.out.print("Value: ");
			Integer num = values.nextInt();
			if(num == 0) {
				break;
			}
			else
			{
				sum += num;
				
			}
			count++;
		}
		values.close();
		System.out.println("\nTotal: "+ sum);
		
		Integer[][] TwoDArray = {{3,19,50,38,28,75,45},{4,6,88,1,3,5,2}};
		
		
		Integer compare = TwoDArray[0][0];
		for(int x = 0; x < TwoDArray.length;x++)
		{
			for(int y = 0; y < TwoDArray[x].length; y++)
			{
				if(TwoDArray[x][y]> compare) {
					compare = TwoDArray[x][y];
				}
				
			}
			
			
		}
		System.out.println("Max Value is: "+ compare);
		
		System.out.println();
		
		Rectangle recObj = new Rectangle(2.0,2.0);
		Triangle triObj = new Triangle(7.0,3.0);
		Circle circObj = new Circle(4.2);
		
		recObj.display();
		triObj.display();
		circObj.display();
		
		
		

	}

}
