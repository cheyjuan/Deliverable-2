import java.util.Scanner;

public class unicode {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstWord;
		String secondWord;
		int sumOne = 0;
		int sumTwo = 0;

		System.out.println("Welcome! Please enter your first word: ");
		firstWord = scnr.nextLine();

		System.out.println(" Please enter your second word: ");
		secondWord = scnr.nextLine();

		char[] char1 = firstWord.toCharArray();
		char[] char2 = secondWord.toCharArray();
		System.out.println("firstWord");
		for (int i = 0; i < firstWord.length(); i++) {

			char letters = firstWord.charAt(i);
			int unicode = (int) letters;
			sumOne = sumOne + unicode;

			System.out.println(letters + " = " + unicode);
		}
		System.out.println("secondWord");

		for (int i = 0; i < secondWord.length(); i++) {

			char letters = secondWord.charAt(i);
			int unicode = (int) letters;
			sumTwo = sumTwo + unicode;
			System.out.println(letters + " = " + unicode);
		}
		int difference = Math.abs(sumOne - sumTwo);
		System.out.println("The difference is: " + difference);
	}
}
