package numbers;

import java.util.Scanner;

public class Totalnumberoffactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<a;i++){
			if(a%i==0) {
			count++;
			}
		}
		System.out.println(count);
	}
}
