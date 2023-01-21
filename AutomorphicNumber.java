package com.demo1;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		//find the length in 1 line;
		//int len=(""+no).length();
		
		//find length using loop
		int temp=no,len=0;
		while(temp>0)
		{
			temp=temp/10;
			len++;
		}
		int sq=no*no;
		int end=sq % (int)Math.pow(10, len);
		
		if(no==end)
		{
			System.out.println("It is  Automorphic Number");
		}
		else {
			System.out.println("It is not Automorphic Number");
		}

	}

}
