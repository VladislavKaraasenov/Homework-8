package homework.eight.task.one;

public class Number implements Comparable<Number> {

	private String element;

	public Number(String element) {
		this.element = element;
	}

	public String getElement() {
		return this.element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	@Override
	public int compareTo(Number o) {
		return this.element.compareTo(o.element);
	}

}
