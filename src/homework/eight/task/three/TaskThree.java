package homework.eight.task.three;

import java.util.*;

public class TaskThree {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		String text = " This is an example ";
		char[] ch = text.toCharArray();
		List<Character> characters = new ArrayList<>();

		for (char c : ch) {
			if (characters.contains(c) == false) {
				characters.add(c);
			}
		}
		for (Character c : characters) {
			sb.append(c);
		}
		String result = sb.toString();
		System.out.println(result);
	}
}
