import java.util.Scanner;

public class palindromikKelimeler{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Bir kelime Giriniz : ");
		String text = input.nextLine();
		String new_text = "";
		char[] wordList = new char[text.length()];
		for(int i=0; i< wordList.length; i++) wordList[i] =  text.charAt(i);

		char reverse;
		for(int k=0; k<wordList.length /  2; k++) {
			reverse = wordList[k];
			wordList[k] = wordList[wordList.length - k -1];
			wordList[wordList.length - k -1] = reverse;		
		}

		for(char o:wordList) new_text+=o;
		if(text.equals(new_text)) System.out.print("\n" + text +" it is a palindromic word");
		else System.out.print("\n" + text + " it is not a palindromic word.");

	}


}
