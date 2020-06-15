package com.wipro;

import java.util.Scanner;

public class Box {
	private double width;
	private double height;
	private double depth;

	public Box() {

	}

	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double calculateVolume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		double depth=sc.nextDouble();
		Box box = new Box(width,height,depth);
		System.out.println(box.calculateVolume());
		

	}

}
