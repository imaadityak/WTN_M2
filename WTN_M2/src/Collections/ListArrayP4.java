package Collections;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
class MyArrayList<E> extends ArrayList<E> {

	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Integer, Float, and Double values supported.");
		}
	}
}

public class ListArrayP4{

	public static void main(String[] args) {
		List<Object> l= new MyArrayList<>();
		
		try {
			l.add(17);
			l.add(0.0);
			l.add(4.0354);
			l.add("String");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(l);

	}

}