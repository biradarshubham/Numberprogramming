package numbers;

import java.util.Scanner;

public class Totalnumberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int a=sc.nextInt();
		int count=0;
		int b=a%10;
		count=count+b;
		System.out.println(count);

	}               
}
  