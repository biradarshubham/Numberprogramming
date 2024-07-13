package numbers;

import java.util.Scanner;

public class additionofalldigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
		int	res=num%10;
		sum=sum+res;
		num=num/10;
			
		}
		System.out.println(sum);
	}

}
