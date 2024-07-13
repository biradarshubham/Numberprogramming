//wajpt check wheather number is special or not?
package numbers;

import java.util.Scanner;

public class Specialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int a=sc.nextInt();
		int a1=a;
		int b=a%10;
		while(a>10) {
			a=a/10;
		}
		int sum=a+b;
		int mult=a*b;
		int add=sum+mult;
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum);
		System.out.println(mult);
		System.out.println(add);
		if(add==a1) {
			System.out.println("it is an special digit");
		}
		else {
			System.out.println("it is not an special digit");
		}
	}

}
//while(num!0){
//sum
//product
//num
