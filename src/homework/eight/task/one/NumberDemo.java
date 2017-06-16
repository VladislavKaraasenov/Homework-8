package homework.eight.task.one;

import java.util.*;

public class NumberDemo {
	public static void main(String[] args) {

		List<Number> elements = new ArrayList<>();

		elements.add(new Number("element1"));
		elements.add(new Number("element5"));
		elements.add(new Number("element3"));

		Collections.sort(elements);

		for (Number n : elements) {
			if (n == Collections.max(elements)) {
				System.out.println(n.getElement());
			}
		}
		
	}
}
