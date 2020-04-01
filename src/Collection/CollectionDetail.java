package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDetail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		//存储元素
		coll.add("abc1");
		/*
		 * 1.存储进入的都是对象的引用
		 * 2.集合中可以存储基本数据类型，但是不是直接存储类型，而是存入了基本数据类型的包装类，依赖于jdk1.5以后的自动装箱功能
		 * 3.取出来的都是Object，需要使用元素特有方法的时候需要向下转型。
		 */
		
		coll.add("abc2");//Object obj = "abc2"
		coll.add("abc3");//取出来的都是Object，需要使用元素特有方法的时候需要向下转型。
		for (Iterator it = coll.iterator(); it.hasNext();) {
			String str = (String)it.next();
			System.out.println(str.length());
		}
	}

}
