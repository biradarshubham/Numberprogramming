package numbers;

import java.util.Scanner;

public class Lastdigitofnumberevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any one number:");
		int a=sc.nextInt();
		int b=a%10;
		System.out.println(b);
		if(b%2==0) {
			System.out.println("it is an even:");
			
		}
		else {
			System.out.println("it is an odd number:");
		}

	}

}
