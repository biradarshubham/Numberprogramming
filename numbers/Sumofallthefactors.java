package numbers;

import java.util.Scanner;

public class Sumofallthefactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum=sum+i;
				System.out.println(i);
				
			}
		}
System.out.println(sum);
	}

}
