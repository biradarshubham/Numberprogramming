package numbers;
//Xylem numbers are those in which the sum of the extreme digits (first and last digits) 
//is equal to the sum of the mean digits (all digits except the first and last).
//Phloem numbers, on the other hand, have distinct sums for extreme and mean digits
import java.util.Scanner;

public class Xtlemphloem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		if(num>99) {
			int sum1=0;
			int sum2=0;
			int rem=0;
			rem=num%10;
			sum1=sum1+rem;
			num=num/10;
			while(num>9) 
			{
				rem=num%10;
				sum2=sum2+rem;
				//System.out.println(sum2);
				num=num/10;
			}
			sum1=sum1+num;
			if(sum1==sum2) {
				System.out.println("x");
			}
			else {
				System.out.println("p");
			}
		}
	}
	
	}