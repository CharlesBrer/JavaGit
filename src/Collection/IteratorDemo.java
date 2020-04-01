package Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	private static final Collection ArrayList = null;

	/**
	 * 迭代器
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 集合的取出方式
		 * 每个容器内部存储方式不一样，所以取出的方式也会不一样，所以要依赖于数据结构
		 * 但是如果直接定义在集合中，会耦合性太强，所以做出共性抽取
		 * 通用的实现方法：取元素之前，首先判空，非空则取出一个，空则结束。 --迭代
		 */
		//1.创建集合对象
		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		//iterator();可以获取到给定集合的迭代器
		Iterator it = coll.iterator();
		//使用具体的迭代器获取集合中的元素,参阅迭代器的方法
		while(it.hasNext())
			System.out.println(it.next());
		//java.util.NoSuchElementException 没有所述元素的异常。
		for (Iterator i = coll.iterator(); i.hasNext();) {//在取出操作结束以后，释放迭代器的内存
			System.out.println(i.next());
		}
	}
	

}
