//a number that can be represnted as the sum of the factorial of its individual digit
package numbers;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		while(num>0) {
			rem=num%10;
			int fact=1;
			while(rem>=1) {
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
			if(sum==temp) {
				System.out.println("it is a strong sum");
			}
				else {
					System.out.println("it is not an strong number");
				}
			}
		}
