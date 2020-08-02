package Collections;
import java.util.*;
public class ListArrayP3{
	public static void main(String[] args)
	{
		ArrayList<String> a= new ArrayList<String>();
		a.add("aditya");
		a.add("kanakamalla");
		printAll(a);
	}
	
	public static void printAll(ArrayList<String> a) 
	{
		Iterator<String> i= a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}