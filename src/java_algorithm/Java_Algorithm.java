/**
 *
 * @author Furkan AK @Kowachka.....aa
 */

package java_algorithm;

import java.util.Scanner;

public class Java_Algorithm {

	public static void drawCharacterArray(String input) {

		char letter;
		char letter2;

		for (int i = 0; i < input.length(); i++) {
			letter = input.charAt(i);

			if (letter == 'b') {
				letter2 = input.charAt(i - 1);

				if (letter2 >= '1' && letter2 <= '9') {

					int number = letter2 - 48;

					for (int j = 0; j < number; j++) {
						System.out.print(" ");

					}

				} else {
					System.out.print(" ");
				}

			}
			if (letter == 's') {
				letter2 = input.charAt(i - 1);

				if (letter2 >= '1' && letter2 <= '9') {

					int number = letter2 - 48;

					for (int j = 0; j < number; j++) {
						System.out.print("*");

					}

				} else {
					System.out.print("*");
				}

			}
			if (letter == 'n') {
				letter2 = input.charAt(i - 1);

				if (letter2 >= '1' && letter2 <= '9') {

					int number = letter2 - 48;

					for (int j = 0; j < number; j++) {
						System.out.println();

					}

				} else {
					System.out.println();
				}

			}
			if (letter == 't') {
				letter2 = input.charAt(i - 1);

				if (letter2 >= '1' && letter2 <= '9') {

					int number = letter2 - 48;

					for (int j = 0; j < number; j++) {
						System.out.print(" ");

						System.out.print(" ");
						System.out.print(" ");
					}

				} else {
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(" ");

				}

			}
		}

	}

	public static String translatetoCapitalLetter(String input) {
		String character_control = "";

		char letter_control;
		for (int i = 0; i < input.length(); i++) {

			letter_control = input.charAt(i);

			if (letter_control >= 'a' && letter_control <= 'z' || letter_control == ' ') {

				character_control += letter_control;

			} else {
				character_control += (char) (letter_control + 32);

			}
		}
		character_control = " " + character_control;

		String new_sentence = "";
		for (int i = 0; i < character_control.length(); i++) {

			char letter = character_control.charAt(i);

			if (letter == ' ') {
				new_sentence += letter;

				i++;

				letter = character_control.charAt(i);

				new_sentence += (char) (letter - 32);

			} else {
				new_sentence += letter;

			}

		}

		return new_sentence;

	}

	public static String encryptDecrypt(String input, int shift_value) {

		String new_sentence = "";

		String new_sentence2 = "";
		char letter;
		char letter2;

		for (int i = 0; i < input.length(); i++) {

			letter = input.charAt(i);

			if (letter >= 'A' && letter <= 'Z' || letter == ' ') {

				new_sentence += letter;
			} else {
				new_sentence += (char) (letter - 32);

			}

		}

		if (shift_value > 0) {
			if (shift_value <= 25) {

				for (int j = 0; j < new_sentence.length(); j++) {

					letter2 = new_sentence.charAt(j);

					if (letter2 >= 'A' && letter2 <= 'Z' || letter2 == ' ') {

						if (letter2 != ' ') {
							letter2 = (char) (letter2 + shift_value);

						}

						if (letter2 > 'Z') {
							letter2 = (char) (letter2 + 'A' - 'Z' - 1);

							new_sentence2 += letter2;

						} else {
							new_sentence2 += letter2;

						}

					}

				}

			} else {
				System.out.println("The offset value cannot be greater than 25!");

			}
		}
		if (shift_value < 0) {
			if (shift_value >= -25) {
				for (int j = 0; j < new_sentence.length(); j++) {

					letter2 = new_sentence.charAt(j);

					if (letter2 >= 'A' && letter2 <= 'Z' || letter2 == ' ') {

						if (letter2 != ' ') {
							letter2 = (char) (letter2 + shift_value);

						}

						if (letter2 < 'A') {
							if (letter2 != ' ') {
								letter2 = (char) (letter2 - 'A' + 'Z' + 1);

							}
							new_sentence2 += letter2;

						} else {
							new_sentence2 += letter2;

						}

					}

				}

			} else {
				System.out.println("The offset value cannot be less than -25!");

			}
		}

		return new_sentence2;

	}

	public static void drawaLetter(String character, int size) {

		Scanner sc = new Scanner(System.in);

		char entered_character = character.charAt(0);

		boolean letter_control = true;
		while (letter_control) {

			if (entered_character == 'X' || entered_character == 'Z') {

				letter_control = false;

			} else {
				System.out.println("The entered character is invalid");//
				System.out.print("Enter a character: ");
				character = sc.nextLine();
				entered_character = character.charAt(0);

			}
		}

		boolean number_control = true;
		while (number_control) {

			if (size % 2 != 0 && size >= 5) {
				number_control = false;

				if (entered_character == 'Z') {
					for (int row = 0; row < size; row++) {

						for (int column = 0; column < size; column++) {

							if (row == 0 || row == size - 1 || column == size - 1 - row) {

								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						}
						System.out.println();

					}
				} else {
					for (int row = 1; row <= size; row++) {

						for (int column = 1; column <= size; column++) {

							if (column == row || column == size - row + 1) {

								System.out.print("*");
							}
							System.out.print(" ");

						}

						System.out.println();

					}
				}

			} else {
				System.out.println("The entered size value is invalid.");
				System.out.print("Enter size value: ");
				size = sc.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String menu = "Project 1 User Menu:\n 1. Draw String\n 2. Convert to Uppercase\n 3. Encrypt and Decrypt\n 4. Draw Letter";

		System.out.println(menu);
		System.out.print("Please make a selection: ");
		String exit = in.nextLine();
		String letter_translation = "";

		char letter;
		int choice2 = 0;
		for (int i = 0; i < exit.length(); i++) {
			if (exit.charAt(i) >= '1' && exit.charAt(i) <= '9') {

				choice2 = exit.charAt(i) - 48;

			}

			letter = exit.charAt(i);

			if (letter >= 'a' && letter <= 'z') {

				letter_translation += letter;
			} else {
				letter_translation += (char) (letter + 32);

			}
		}

		while (!letter_translation.equals("exit")) {

			switch (choice2) {
			case 1: {

				System.out.print("Enter a series of characters: ");

				String text = in.nextLine();
				drawCharacterArray(text);

				System.out.println();

				break;

			}
			case 2: {

				System.out.print("Enter Sentence: ");

				String user_sentence = in.nextLine();
				System.out.println("Output: " + translatetoCapitalLetter(user_sentence));

				System.out.println();
				break;

			}
			case 3: {

				System.out.print("Enter a sentence: ");

				String bb = in.nextLine();
				System.out.print("Enter the offset value: ");

				int shift_value = Integer.parseInt(in.nextLine());
				System.out.println("Encrypted Text: " + encryptDecrypt(bb, shift_value));

				break;

			}
			case 4: {

				System.out.print("Enter a character: ");

				String entered_character = in.nextLine();
				System.out.print("Enter size value: ");

				int size_value = Integer.parseInt(in.nextLine());
				drawaLetter(entered_character, size_value);

				break;

			}
			default:

				break;
			}
			exit = "";
			choice2 = 0;
			letter_translation = "";

			System.out.println(menu);
			System.out.print("Please make a selection: ");

			exit = in.nextLine();

			for (int i = 0; i < exit.length(); i++) {
				if (exit.charAt(i) >= '1' && exit.charAt(i) <= '9') {

					choice2 = exit.charAt(i) - 48;

				}

				letter = exit.charAt(i);

				if (letter >= 'a' && letter <= 'z') {

					letter_translation += letter;
				} else {
					letter_translation += (char) (letter + 32);

				}
			}

		}
	}

}
