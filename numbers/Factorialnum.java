package numbers;

public class Factorialnum {

	public static void main(String[] args) {
	//int fact=1;
	for(int i=5;i<=10;i++) {
		int fact=1;
		System.out.println(i);
		for(int j=1;j<=i;j++) {
			fact=fact*j;
		}

	System.out.println(fact);
	}
}
}
