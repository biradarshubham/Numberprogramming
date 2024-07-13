package numbers;

import java.util.Scanner;

public class Lastdigitofanumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your number:");
		int a=sc.nextInt();
		int b=a%10;
		
		System.out.println(b);
	}

}
