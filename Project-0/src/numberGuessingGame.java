import java.util.Scanner;
import java.util.Random;
public class numberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int guessing,due = 5,number;
        char _continue;
        number = random.nextInt(1,50);
        while(true) {
            while(true) {
                if(due <=0) {due = 0; break;}
                System.out.print("Guessing : ");
                guessing = input.nextInt();
                if(guessing > number) System.out.println("Your guess is greater than the number held");
                else if(guessing < number) System.out.println("Your guess is less than the number held");
                else {System.out.println("Congratulations you know\n"); break;}
                due--;
            }
            System.out.print("Do you want to continue? : ");
            _continue = input.next().toLowerCase().charAt(0);
            if(_continue == 'y') {
                due = 5;
                number = random.nextInt(1,50);
            }
            else break;
        }

    }
}
