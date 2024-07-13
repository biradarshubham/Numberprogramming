package numbers;

import java.util.Scanner;

public class Swaptwovar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("value of first number is:"+a);
		System.out.println("value of second number is:"+b);
	}

}
