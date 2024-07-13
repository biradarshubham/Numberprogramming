package numbers;
//buzz number is another special number in java that ends with digit 7 or divisible by 7...
import java.util.Scanner;

public class Buzznumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
	
			if(num%10==0 || num%7==0) {
				System.out.println("it is a buzz number");
			}
			else {
				System.out.println("it is not a buzz number");
			}
		}
	}

