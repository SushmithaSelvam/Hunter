import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FirstRepeatedElement {
	public static void firstRepeatedElement(int[] array) {
		int number = 0;
		int count = 0;
		Set<Integer> set = new TreeSet<>();
		for (int i : array) {
			if (!set.contains(i)) {
				set.add(i);
			} else {
				number = i;
				count++;
				break;
			}
		}
		if (count == 1)
			System.out.println("The first repeated number is  " + number);
		else
			System.out.println("no repeated element");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of elements in an array");
		int number = scanner.nextInt();
		System.out.println("Enter the elements");
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}
		firstRepeatedElement(array);
		scanner.close();
	}
}
