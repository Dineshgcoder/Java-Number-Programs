package com.demo1;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		double sqr,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		sqr=Math.sqrt(num+1);
		d=sqr-Math.floor(sqr);
		
		if(d==0.0)
		{
			System.out.println("sunny number");
		}
		else {
			System.out.println("not a sunny number");
		}
		
		sc.close();
	}

}
