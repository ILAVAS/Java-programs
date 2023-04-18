package practice;

import java.util.Scanner;

public class sumofdigitsuptosingle {
	public static int sum(int num)
	{
		if(num==0)
			return 0;
		else if (num%9==0) 
		     return 9;
		else 
			return num%9;
	}
		public static void main(String[] args) {

		int num,sumofdigits=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		sumofdigits=sum(num);
		System.out.println("sum of its digits till it reduces to single digit:" +num+"=" +sumofdigits);
	}

}
