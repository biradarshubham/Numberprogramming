//spy  number is a sum of all digit==product of all digit
package numbers;

import java.util.Scanner;

public class Spynumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		int a=sc.nextInt();
		int sum=0;
		int mult=1;
		while(a>=10) {
			int b=a%10;
			sum=sum+b;
			mult=mult*b;
			a=a/10;
		//System.out.println(sum);
		//System.out.println(mult);
		}
		if(sum==mult) {
			System.out.println("its an spy number ");
			
		}
		else {
			System.out.println("it is not an spy number");
		}
		

	}

}
