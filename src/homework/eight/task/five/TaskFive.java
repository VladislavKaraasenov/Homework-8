package homework.eight.task.five;

import java.util.*;

public class TaskFive {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter text: ");

		Stack<String> stack = new Stack<String>();
		boolean shouldContinue = true;
		final String END_OF_TEXT = "End of text";

		while (shouldContinue) {
			String text = sc.nextLine();
			if (text.equalsIgnoreCase(END_OF_TEXT)) {
				shouldContinue = false;
				sc.close();
				while (stack.size() > 0) {
					String result = stack.pop();
					System.out.println(result);
				}
			} else {
				text = stack.push(text);
			}
		}
	}
}