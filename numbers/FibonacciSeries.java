package numbers;

import java.util.Scanner;

public class FibonacciSeries { //0,1,1,2,3,5,8,13

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to print fibonacci series till that no");
		int num=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		int count=0;
		for(int i=0;i<num;i++) {
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
			count++;
	
		}
	}

}

