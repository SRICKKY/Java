import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		

		System.out.println("Contents of al: "+al);

		Integer ia[] = new Integer[al.size()];
		ia = al.toArray(ia);

		int sum =0;
		for(int i:ia)	sum+=i;

		System.out.println("Sum is : "+sum);


	}
}