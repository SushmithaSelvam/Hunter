import java.util.Scanner;

public class ReverseOrderOfWords{
	public static void reverseOrderOfWords(String str){
		String[] array=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<array.length;i++){
			sb.append(new StringBuffer(array[i]).reverse()+" ");
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string");
		String string=scanner.nextLine();
		reverseOrderOfWords(string);
		scanner.close();
	}
}
