package numbers;

import java.util.Scanner;

public class Firstdigitofanumber {
	public static void main(System[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		int a=sc.nextInt();
		int b=a%10;
		while(a>=10) {
			a=a/10;
		}
		System.out.println(a);
		if(a%2==0) {
			System.out.println("it is an even number");
			
		}
		else {
			System.out.println("it is an odd number");
		}
	}
}

