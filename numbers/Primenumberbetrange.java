package numbers;

import java.util.Scanner;

public class Primenumberbetrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int start=sc.nextInt();
		System.out.println("enter ending number");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int num=i;
			int count=0;
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.println(i);
			}
			
		}
	}

}
