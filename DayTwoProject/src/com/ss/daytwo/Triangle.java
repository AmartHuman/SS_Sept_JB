package com.ss.daytwo;

public class Triangle implements Shape {
	
	private Double base;
	private Double hight;
	
	public Triangle() {};
	public Triangle(Double B, Double H)
	{
		base = B;
		hight = H;
	}


	@Override
	public double calculateArea() {
		Double sum = base * hight;
		return sum;
	}

	@Override
	public void display() {
		Double sum = calculateArea();
		System.out.println("Area of the Triangle: " + sum);
		
	}





}
