package numbers;
//prime number is a number that is greater than 1 and divided by 1 or itself only... 
import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++) { //2<5t 3 3<5t  4 4<5t 5 5<5f
			if(num%i==0) {//5f 3f 4f 
				count++;  //1
			}
			
		}
		if (count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("no");
		}

	}

}
