import java.util.Scanner;

public class UnsortedArrayElementOnce {
	public static void findElementOnce(int[] array){
		int unique=0;
for(int i:array){
	unique ^=i;
}
System.out.println(unique);
	}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number of elements in an array");
	int number=scanner.nextInt();
	int[] array=new int[number];
	System.out.println("enter the elements");
	for(int i=0;i<number;i++){
		array[i]=scanner.nextInt();
	}
	findElementOnce(array);
	scanner.close();
}
}
