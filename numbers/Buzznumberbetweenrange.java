package numbers;
	import java.util.Scanner;

	public class Buzznumberbetweenrange {
		
		public static boolean isbuzzno(int num){
			return (num%7==0 || num%10==7)?true:false;
			
			}
			
			
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number to print 1 to 100 buzz no");
			int num=sc.nextInt();
				for(int i=1;i<=100;i++) {
					boolean buzz=isbuzzno(i);
					if(buzz) {
						System.out.println(i);
					}
				}
				
		}

	}