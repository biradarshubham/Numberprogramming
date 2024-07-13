package numbers;

import java.util.Scanner;

public class mtopowern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base number");
		int m=sc.nextInt();
		System.out.println("enter power value");
		int n=sc.nextInt();
		
		int prod=1;
		for( int i=1;i<=n;i++) {
			prod=prod*m;
		}
		System.out.println(m+"power"+n+"is :"+prod);
		

	}
}
