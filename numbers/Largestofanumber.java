package numbers;

import java.util.Scanner;

public class Largestofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int a=sc.nextInt();
		int large=0;
		while(a!=0) {
		int b=a%10;
		large=large>b?large:b;
		a=a/10;
		
		}
		//anotehr way
		//rem=0,dogit=0;
		//rem=num%10;
		//if(digit<rem){
		//digit=rem;
		//}
		//num=num/10;
		System.out.println("largest number of given number is:"+large);

	}

}
