package com.ss.daytwo;

public class Rectangle implements Shape{
	
	private Double L;
	private Double W;
	
	public Rectangle() {}
	public Rectangle(Double Length, Double Width) {
		L = Length;
		W = Width;
		
	};
	
	
	public void setL(Double Length) { L = Length; }
	public void setW(Double Width) {W = Width;}	
	
	public Double GetL() {return L;}
	public Double getW() {return W;}
	
	@Override
	public double calculateArea() {
		Double sum = L*W;
		
		return sum;
	}

	@Override
	public void display() {
		Double sum = calculateArea();
		System.out.println("Area of the Rectangle: "+ sum);
		
	}




}
