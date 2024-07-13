package numbers;

import java.util.Scanner;

public class ReverseEndwWthOdd {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		for(int i=num;i<=500;i++) {
			if(i%2==1) {
				int reverse=0;
				int n=0;
				int a=i;
				while(a>0) {
					n=a%10;
					reverse=reverse*10 + n;
					a=a/10;
			}
				System.out.println("reverse odd no is "+reverse);
			
				}
			
		

		}
	}
}
