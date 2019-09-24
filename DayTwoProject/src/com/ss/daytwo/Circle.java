package com.ss.daytwo;

public class Circle implements Shape{
	
	private Double Radius;
	
	public Circle() {}
	
	public Circle(Double rad)
	{
		Radius = rad;
	}
	
	public void setRadius(Double rad) {Radius = rad;}
	
	public Double getRadius() {return Radius;}


	@Override
	public double calculateArea() {
		Double sum = Math.PI*Math.sqrt(Radius);
		
		return sum;
	}

	@Override
	public void display() {
		Double sum = calculateArea();
		System.out.println("Area of a Circle: " + sum);
		
	}





}
