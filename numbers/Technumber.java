 package numbers;

import java.util.Scanner;

public class Technumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			int rem=num%10;
			count++;
			num=num/10;
		}
		int num1=count;
		if(num1%2==0) {
			int split=num1/2;
			int num2=0;
			while(split!=0) {
				int rem1=num%10;
				num2 = rem1;
				split--;
				System.out.println(num2);
			}
		}
		else {
			System.out.println("it is not a take number");
			
		}
	}

}
