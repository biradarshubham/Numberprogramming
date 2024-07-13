//square of each digit then sum of it should be 1digit
package numbers;

//49  4^2 + 9^2=16+81=97  9*9+7*7= 81+49=130 till no become 1
import java.util.Scanner;
public class Happynumber {

public static int happyNo(int num) {
	int sqr=0;
	int rem=0;
	int sum=0;
	while(num>9) {
		while(num>0) {
		rem=num%10;
		sqr=rem*rem;
		sum=sum+sqr;
		num=num/10;
	}
		
	}
	
	if(sum>9) {
//		System.out.println(sum);
		sum=happyNo(sum);
	}
	return sum;
}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int num=sc.nextInt();
		
		int n=happyNo(num);
		System.out.println(n);
//		
		System.out.println(n==1?"is happy no":"is  sad no");		
	}

}
