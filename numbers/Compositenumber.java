
package numbers;

import java.util.Scanner;

public class Compositenumber {

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
		if (count>0) {
			System.out.println("Composite number");
		}
		else {
			System.out.println("no");
		}

	}

}
