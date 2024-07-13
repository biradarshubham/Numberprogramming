package numbers;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number:");
		int a=sc.nextInt();
		int rev=0;
		int c=a;
		while(a!=0) {
			int b=a%10;
			rev=rev*10+b;
			a=a/10;
		}
			//System.out.println(rev);
			if(rev==c) {
				System.out.println("it is an palindrome number: "+rev);
					}
			else {
			System.out.println("it is not an palindrome number: "+rev);
				
		}
		
	}
}
