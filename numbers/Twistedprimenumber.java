package numbers;

import java.util.Scanner;

public class Twistedprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter any number");
				int num=sc.nextInt();
				int count=0;
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						count++;
					}
				}
				if (count==0) {
					System.out.println("prime number");
				int rev=0;
				while(num!=0) {
				int b=num%10;
				rev=rev*10+b;
				num=num/10;
				}
				System.out.println(rev);
				int count1=0;
				for(int i=2;i<num;i++) {
					if(rev%i==0) {
						count1++;
					}
				}
				if (count1==0) {
					System.out.println("twisted prime number");
				}
				else {
					System.out.println("no");
				}
			
				}
				else {
					System.out.println("it is not a prime number");
				}
}
	}

