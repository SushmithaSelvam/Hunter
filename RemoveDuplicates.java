import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a string");
	String string=scanner.next();
	String str=string.toLowerCase();
	Set<String> set=new TreeSet<>();
	for(int i=0;i<str.length();i++){
		set.add(str.charAt(i)+"");
	}
	String orgstring="";
	Iterator< String> it=set.iterator();
	while(it.hasNext()){
		orgstring +=it.next();
	}
	System.out.println("String after removing duplicates  "+orgstring);
	scanner.close();
}
}
