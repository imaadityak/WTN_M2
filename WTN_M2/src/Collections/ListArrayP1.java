package Collections;
import java.util.*;
public class ListArrayP1{
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("January");
		a.add("Febuary");
		a.add("March");
		a.add("April");
		a.add("May");
		a.add("June");
		a.add("July");
		a.add("August");
		a.add("September");
		a.add("October");
		a.add("November");
		a.add("December");
  Iterator<String> i= a.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}