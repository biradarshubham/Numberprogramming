package numbers;

import java.util.Scanner;

public class Disariumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int count=0;
		int tem=num;
		while(tem!=0){ //it is for count the numbers
			tem=tem/10;
			count++;
		}
		System.out.println("total count:"+count);//it will give the number of count
		int rem=0;
		 tem=num;
		 int sum=0;
		while(tem>0) //
		{
			rem=tem%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod=prod*rem;
			}
			sum=sum+prod;
			count--;
			tem=tem/10;
		}
		if(sum==num) {
			System.out.println("it ia a desarium number");
			
		}
		else {
			System.out.println("it is not a desarium number");
		}
	}

}
