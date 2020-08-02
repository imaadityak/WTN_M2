package Collections;

import java.util.Vector;

import java.util.Iterator;

public class ListVectorP2 {
	public static void main(String[] args) {
		Vector<Employee> l= new Vector<>();
		
		l.add(new Employee(101, "Hina", "HYD, India",1000000.0));
		l.add(new Employee(102, "Bhargav", "BGl, India",1100000.0));
		l.add(new Employee(103, "Vijay", "VIJ, India",1200000.0));
		l.add(new Employee(104, "Munna", "MUM, India",1400000.0));
		
		Iterator<Employee> i = l.iterator();
		while (i.hasNext()) 
			System.out.println(i.next());
	}
}

class Employee {
	private int id;
	private String name;
	private String ad;
	private Double sal;
	
	public Employee(int id, String name, String ad, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
		this.sal = sal;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee : id= " + id + ", name= " + name + ", ad= " + ad+ ", sal= " + sal;
	}
}
