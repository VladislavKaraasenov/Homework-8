package homework.eight.task.four;

import java.util.Scanner;

public class TaskFour {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter text: ");

		StringBuilder sb = new StringBuilder();
		boolean shouldContinue = true;
		final String END_OF_TEXT = "End of text";

		while (shouldContinue) {
			String text = sc.nextLine();
			if (text.equalsIgnoreCase(END_OF_TEXT)) {
				shouldContinue = false;
				sc.close();
				String result = sb.toString();
				System.out.println(result);
			} else {
				sb.append(text);
			}
		}
	}
}
