package com.wipro;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
	
	}
    public static void powerInt(int num1,int num2) {
    	System.out.println(Math.pow(num1,num2));
    }
    public static void powerDouble(double num1,int num2) {
    	System.out.println(Math.pow(num1,num2));
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		double num3=sc.nextDouble();
		int num4=sc.nextInt();
		powerInt(num1,num2);
		powerDouble(num3,num4);

	}

}
