package numbers;

import java.util.Scanner;

public class Firstdigitevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any do you want to check:");
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
