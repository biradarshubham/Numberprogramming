package numbers;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int sqr=0;
		int sum=0;
		
		sqr=num*num;
		while(sqr!=0) {
			int rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
		}
		if(sum==num) {
			System.out.println("it is a neon number");
		}else {
			System.out.println("it is not a neon number");
		}
	}
}
