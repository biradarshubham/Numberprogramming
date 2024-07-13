package numbers;

import java.util.Scanner;

public class Smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your ab number");
		int a=sc.nextInt();
		int smallest=9;
		while(a!=0) 
		{
			int b=a%10;
			//smallest=smallest+b;
			smallest=smallest<b?smallest:b;
			a=a/10;
		}
		System.out.println(smallest);
	}
}
/*
 * int rem=0;
 * int digit=9;
 * while(num!=0){
 * rem=num%10;
 * if(digit>rem){
 * digit=rem;
 * } 
 * num=num/10;
 * }
 * sop(digit);*/