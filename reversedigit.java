package practice;

import java.util.Scanner;

public class reversedigit {
	 static int reverseDig (int num)
	{
		int revnum=0;
		while(num>0)
		{
			revnum=revnum*10+num%10;                    //remainder=num%10
			num=num/10;
		}return revnum;
	}
	public static void main (String []args)
	{   
		int num=0;
		int Digits=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer number");
		num=sc.nextInt();
		Digits=reverseDig(num);
		System.out.println("The Reverse digits are " +Digits);
		sc.close();
	}
	
	
	
	
	
	
	
}
