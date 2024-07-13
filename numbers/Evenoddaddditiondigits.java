package numbers;

import java.util.Scanner;

public class Evenoddaddditiondigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any number do you want:");
		int a=sc.nextInt();
		int even=0;
		int odd=0;
		while(a!=0) {
		int b=a%10;
		if(b%2==0) {
			//System.out.println("even number");
			even=even+b;	
		}
		else {
			//System.out.println("odd number");
			odd=odd+b;
		}
		a=a/10;
	}
		System.out.println(even+odd);
	}

}
