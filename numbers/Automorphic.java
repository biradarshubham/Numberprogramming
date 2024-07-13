package numbers;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int sqr=num*num;
		System.out.println(sqr);
		boolean flag = true;
		while(num>0)
		{
		if(num%10!=sqr%10)
		{
		flag=false;
		}
		num=num/10;
		sqr=sqr/10;
		}
		if(flag)
		{
			System.out.println("it is a automorphic");
			
		}else {
			System.out.println("it is not a automorphic");
		}

	}

}

/*int num=take from user
int sqr=num*num;
boolean flag=true;
while(num!==0){
if(num%10!=sqr%10){
flag=false;
}
num=num/10;
sqr=sqr/10;
}
if (flag){
sop("auto");
}else{sop(no)}}
*/
