package practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
int sum=0,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
int temp=sum;
int a=num;
while(num>0)
{
	temp=num%10;
	sum=sum+(temp*temp*temp);
	num=num/10;
}
	if(sum==a) {
		System.out.println("armstrong number");
	}else
	{
		System.out.println("Not a armstrong number");
	}
		
	}

}
