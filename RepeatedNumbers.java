# Hunter
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RepeatedNumbers {
	public static void repeatedNumbers(int[] regno) {
		Set<Integer> set1=new TreeSet<>();
		Set<Integer> set=new TreeSet<>();
	for(int i=0;i<regno.length;i++){
		if(!set.add(regno[i])){
			set1.add(regno[i]);
		}
	}
System.out.println("The repeated elements are  "+set1);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of registrations");
		int number = scanner.nextInt();
		int[] regno = new int[number];
		for (int i = 0; i < number; i++) {
			regno[i] = scanner.nextInt();
		}
		repeatedNumbers(regno);
		scanner.close();
	}
}
