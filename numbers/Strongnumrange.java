package numbers;

import java.util.Scanner;
public class Strongnumrange {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number:");
			int start=sc.nextInt();
			System.out.println("enter end number:");
			int end=sc.nextInt();
			for(int i=start;i<end;i++) {
				int temp=i;
				int num=i;
				int sum=0;
				int rem=0;
				while(temp>0) {
					rem=temp%10;
					int fact=1;
					for(int j=1;j<=rem;j++) {
						fact=fact*j;
					}
					sum=sum+fact;
					temp=temp/10;
				}
				if(num==sum) {
					System.out.println(i);
				}
				else {
					System.out.println("nothing");
				}
			}
		}
		}
