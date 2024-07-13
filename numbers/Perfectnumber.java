//a number whos sum of factors is equal to the number inserted.
package numbers;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum=sum+i;
				
			}
		}
		if(sum==a) {
			System.out.println("it is a perfect number");
		}
		else {
			System.out.println("it is not a perfect number");
		}
		
	}

}
