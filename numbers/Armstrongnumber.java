package numbers;
//if the sum of its own digits raised to a power of digits results in the number itself.

	import java.util.Scanner;
	import java.lang.Math;
	public class Armstrongnumber {

		public static void main(String[] args) {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("enter no to check armstrong or not");
			  int num=sc.nextInt();
			  int n=num;
			  int n2=num;
			  int sum=0;
			  int n1=0;
			  int n3=0;
			  int count=0;
			  while(num>0){
			   num=num/10;
			   count++;
			  }
			  System.out.println("count "+count);
			  while(n>0){
			   sum=n%10;
			    n1=(int) (Math.pow(sum,count));
			   n3=n3+n1;
			   n=n/10;
			   }
			    if(n2==n3){
			     System.out.println(n2+" is armstrong no");
			    }
			    else{
			     System.out.println(n2+" is not armstrong no");
			  }
			 }
			 
			}
