package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 方法：
		 * add(Object) 往集合中添加元素
		 * remove(Object) 删除集合中的元素
		 * contains(Object) 判断集合中是否有这个元素
		 * isEmpty() 		判空
		 * clear() 			清空
		 * 
		 * adddAll(Collection) 将整个集合添加到调用集合中
		 * removeAll(Collection) 删掉交集
		 * retainAll(Collection) 求出交集
		 */
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		collectiondemo1(c1,c2);

	}

	public static void collectiondemo1(Collection c1, Collection c2) {
		c1.add("1");
		c1.add("2");
		c1.add("3");
		
		c2.add("1");
		c2.add("2");
		c2.add("5");
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
		c1.remove("1");
		System.out.println("c1="+c1);
		System.out.println(c1.contains("2"));
		
		c1.add("1");
		System.out.println("c1="+c1);
		
	}

}
