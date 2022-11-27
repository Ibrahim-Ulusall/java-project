import java.util.Scanner;

public class palindrom{
	public static void main(String[] args){
		//Verilen Sayı veya kelimenin tersi kendine eşitse bu bir palindrom ifadedir.
		//Ör : 121 , kapak vs..
		int counter = 0, temp,fixed; 
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz : ");
		int number = input.nextInt();
		temp = number;
		fixed = number;
		// Basamak Sayısı Hesaplama
		while(number > 0 ) {
			number /= 10;
			counter++;
		}

		int[] numberList = new int[counter];
		for(int i=0; i<counter; i++){
			numberList[i] = temp % 10;
			temp /=10;
		}
		
		for(int o:numberList) temp = temp * 10 + o;
		if(temp == fixed) System.out.print("\n" + fixed + " sayısı palindrom bir sayıdır.");
		else System.out.print("\n" + fixed + " sayısı palindrom bir sayı değildir.");
	}
}
