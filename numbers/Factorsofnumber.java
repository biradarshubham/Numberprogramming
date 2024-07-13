//mod of all digit should be 0
package numbers;

import java.util.Scanner;

public class Factorsofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any nuber");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
