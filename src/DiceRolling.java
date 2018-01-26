import java.util.Random;
import java.util.Scanner;

public class DiceRolling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ans;

		System.out.println("Hello and welcome to this dice rolling activity! ");

		int rollNum = 1;

		do {
			System.out.println("Please enter the number of sides you'd like the dice to have.");
			int sidesOfDie = input.nextInt();

			System.out.printf("Roll %d: \n", rollNum);

			int firstroll = randoNumGen(sidesOfDie);
			int secondroll = randoNumGen(sidesOfDie);

			System.out.println(firstroll);
			System.out.println(secondroll);

			System.out.println(diceRollerApp(firstroll, secondroll, sidesOfDie));

			rollNum++;

			System.out.println("Want to roll again? Enter y or n: ");
			ans = input.next();

		} while (ans.equalsIgnoreCase("y"));

		System.out.println("Thanks for playing!");
		input.close();

	}

	public static int randoNumGen(int upper) {
		Random generator = new Random();

		int rollResult = generator.nextInt(upper) + 1;
		return rollResult;
	}

	public static String diceRollerApp(int first, int second, int sides) {
		String win = "Nothing special :(";
		
		if (first + second == sides + 1) {
			win = "Craps!";
		}
		else if (first == 1 && second == 1) {
			win = "Snake eyes!";
		} 
		else if (first == 6 && second == 6) {
			win = "Boxcar!";
		}
		return win;
	}

}
