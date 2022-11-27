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
		
		//region II.YONTEM
		
		String temp="";
		for(int f=text.length() -1; f>=0; f++){
			temp += text.charAt(f);
		}
		if(text.equals(temp)) System.out.println("Bu bir palindromik kelimedir.");
		else System.out.println("Bu bir palindromik kelime değildir.");
		//endregion
	}


}
