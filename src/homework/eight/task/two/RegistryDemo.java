package homework.eight.task.two;

public class RegistryDemo {
	public static void main(String[] args) {

		Registry<String> names = new Registry<>("Names", 3);
		names.addElement("Goshko");
		names.addElement("Pesho");
		names.addElement("Ivancho");
		names.removeElement("Pesho");

		System.out.println(names.getElementsSize());
		System.out.println(names.getElements());
		System.out.println("----------");

		Registry<Integer> numbers = new Registry<>("Numbers", 8);
		numbers.addElement(1);
		numbers.addElement(2);
		numbers.addElement(3);
		numbers.addElement(4);
		numbers.addElement(5);
		numbers.addElement(6);
		numbers.addElement(7);
		numbers.addElement(8);
		numbers.addElement(9);
		numbers.addElement(10);

		System.out.println(numbers.getElementsSize());
		System.out.println(numbers.getElements());
	}
}
