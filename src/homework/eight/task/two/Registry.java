package homework.eight.task.two;

import java.util.*;

public class Registry<T> {

	private String name;
	private List<T> elements;
	private int countElements;

	public Registry(String name, int countElements) {
		this.name = name;
		this.elements = new ArrayList<>(this.countElements = countElements);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountElements() {
		return this.countElements;
	}

	public void setCountElements(int countElements) {
		this.countElements = countElements;
	}

	public boolean addElement(T element) {
		if (this.elements.size() >= this.countElements) {
			return false;
		} else {
			this.elements.add(element);
		}
		return true;
	}

	public void removeElement(T element) {
		this.elements.remove(element);
	}

	public int getElementsSize() {
		return this.elements.size();
	}

	public List<T> getElements() {
		return elements;
	}

}
