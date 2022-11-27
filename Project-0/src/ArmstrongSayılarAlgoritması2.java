import java.util.Scanner;
public class Main{

	static int power(int x, int y){
		int result = 1;
		for(int i = 1; i<=y; i++) result *= x;
		return result;	
	}

	public static void main(String[] args){
		int temp,counter=0,fixed;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number = input.nextInt();
		temp = number;
		fixed = number;
		// Basamak Sayısını Hesapla
		while(number > 0) {
			number /= 10;
			counter++;
		}

		int[] numberList = new int[counter];
		for(int i=0; i<counter; i++) {
			numberList[i] = temp % 10;
			temp /=10;
		}
		//Liste okuma
		int sum = 0;
		for(int o:numberList) sum += power(o,counter);
		if(fixed == sum) System.out.print("This number is the Armstrong number.");
		else System.out.println("This number is not an Armstrong number.");
	}
}
