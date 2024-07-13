package numbers;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				System.out.println("enter any number do you want: ");
				int a=sc.nextInt();
				int rev=0;
				while(a!=0) {
				int b=a%10;
				rev=rev*10+b;
				a=a/10;
				
				}
				System.out.println(rev);
	}

}
