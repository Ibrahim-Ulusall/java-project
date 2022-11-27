import java.util.Scanner;

public class Main{

	static int power(int y){
		int result = 1;
		for(int i=1; i<=3; i++) result *=y;
		return result;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı Giriniz : ");
		int sayi = input.nextInt();

		int temp,birler,onlar,yuzler;
		temp = sayi;
		birler = sayi % 10;
		sayi = sayi /10;
		onlar = sayi % 10;
		yuzler = sayi / 10;

		System.out.printf("Yüzler Basamağı : %d%nOnlarBasamağı: %d%nBirlerBasamağı:%d%n",yuzler,onlar,birler);
		int isAmstrong = power(birler) + power(onlar) + power(yuzler);
		if(temp == isAmstrong) System.out.println(temp + " sayısı Armstrong sayıdır.");
		else System.out.println(temp + " sayısı Armstrong sayı değildir.");
	}

}
