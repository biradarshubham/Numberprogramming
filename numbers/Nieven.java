package numbers;

import java.util.Scanner;

public class Nieven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any bunber");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println(sum);
		if(num%sum==0) {
			System.out.println("yes");
		}
		 else 
		{
			System.out.println("noo");
		}
	}

}
