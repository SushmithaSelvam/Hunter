import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumberEqualsIndex {
	public static void equalsIndex(int[] array){
		Set<Integer> set=new TreeSet<>();
		for(int i=0;i<array.length;i++){
			if(i==array[i]){
				set.add(array[i]);
			}
		}
		System.out.println(set);
	}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number of elemnts in an array in increasing order");
	int number=scanner.nextInt();
	int[] array=new int[number];
	System.out.println("enter the elements");
	for(int i=0;i<number;i++){
		array[i]=scanner.nextInt();
	}
	equalsIndex(array);
	scanner.close();
}
}
