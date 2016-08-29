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
		int count=0;
	for(int i=0;i<regno.length;i++){
		if(!set.add(regno[i])){
			set1.add(regno[i]);
		}
		
	}
	if(set1.size()==0){
		System.out.println("No repeated elements");
	}
	else{
		System.out.println("the repeated elements are  "+set1);
	}
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
