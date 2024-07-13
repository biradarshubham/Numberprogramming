package numbers;

import java.util.Scanner;

public class additionoffirstandlast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		int b=a%10;
		while(a>=10) {
			a=a/10;
		}
		System.out.println(a+b);
	}
}
