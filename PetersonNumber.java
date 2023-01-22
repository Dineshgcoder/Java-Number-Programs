package com.demo1;

import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
		int temp=n;
		int sum=0;
		while(temp!=0)
		{
			int r=temp%10;
			int f=1;
			for(int i=r;i>0;i--)
			{
				f=f*i;
			}
			sum=sum+f;
			temp=temp/10;
		}
		if(sum==n)
		{
			System.out.println("Number is Peterson "+n);
		}
		else {
			System.out.println("Number is not Peterson "+n);
		}
 sc.close();
  }
}
