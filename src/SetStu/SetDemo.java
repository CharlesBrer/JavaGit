package SetStu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import practice.domain.Student;
	/**
	 * 
	 * @author cheney
	 *
	 */
public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new Student("LIsi",21));
		set.add(new Student("LIsi",22));
		set.add(new Student("LIsi",24));
		set.add(new Student("LIsi",21));
		
		for (Iterator it = set.iterator(); it.hasNext();) {
				System.out.println(it.next());
		}
	}
}
