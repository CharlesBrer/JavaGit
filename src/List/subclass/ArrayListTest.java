package List.subclass;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import practice.domain.Student;

public class ArrayListTest {
	/**
	 * 虽然可以做，但是比较麻烦。
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 案例：去除List集合中的重复元素
		 * 
		 * 1.创建一个临时容器
		 * 2.遍历原容器，将遍历到的元素到临时容器判断存在
		 * 3.存在不存储，不存在存储
		 * 4.结束以后，临时容器中存储了唯一性元素
		 * 5.如果需要保留到原容器，则将原容器情空，将临时容器中的元素添加到原容器。
		 */
		List list = new ArrayList();
//		list.add("abc1");
//		list.add("abc1");
//		list.add("abc2");
//		list.add("abc2");
		list.add(new Student("Lisi 1",21));
		list.add(new Student("Lisi 1",21));
		list.add(new Student("Lisi 1",21));
		list.add(new Student("Lisi 1",21));
		list.add(new Student("wangwu 2",25));
		list.add(new Student("wangwu 2",25));
		list.add(new Student("wangwu 2",25));
		list.add(new Student("wangwu 2",25));
		list.add(new Student("wangwu 2",25));
		System.out.println(list);
		getSingleElement(list);
		System.out.println(list);
		
	}
	public static void getSingleElement(List list){
		List t = new ArrayList();
		
		for (Iterator it = list.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			//每一个元素都到临时容器中判断包含。
			if(!t.contains(obj)){ //如果不包含，就存入临时数组---底层通过对象的equals方法判断
				t.add(obj); 
			}
		}
		//唯一性元素已经被记录到临时容器
		list.clear();
		list.addAll(t); //将原容器清空，填入新元素返回。
	}
}
