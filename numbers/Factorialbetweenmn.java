package numbers;

import java.util.Scanner;

public class Factorialbetweenmn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		char a=sc.next().charAt(1);
		int m= (int)a;
		System.out.println("enter last number");
		char b=sc.next().charAt(1);
		int n=(int)b;
		for(int i=a;i<=b;i++) {
			int fact=1;
			System.out.println(i);
			for(int j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println(fact);
		}
	}

}
