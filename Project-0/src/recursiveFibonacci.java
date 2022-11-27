import java.util.Scanner;

public class recursiveFibonacci{
	
	// 1 1 2 3 5 8 13 21 34 55
	// f(6) = f(4) + f(5)
	// f(x) = f(x-1) + f(x-2);
	static int f(int number) {
		if(number<=0) return 0;
		if(number ==2 || number ==1) return 1;
		return f(number -2 ) + f(number -1);	
	}
	
	public static void main(String [] args) {
		for(int i = 1; i<=10; i++) {
			System.out.println(f(i));
		}
	}
	
}
