package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListItercator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("baixingyu1");
		list.add("baixingyu2");
		list.add("baixingyu3");
		list.add("baixingyu4");
		/*
		 * 获取集合中的元素
		 * 如果集合中有元素等于baixingyu2，那么插入一个新的元素java
		 * 在迭代过程中，使用了集合的方法对集合进行操作，导致迭代器并不知道集合发生的变化，引发了数据的不确定性。
		 * 
		 * 解决：在迭代过程中，不使用集合的方法操作元素。
		 *   想要操作的时候，可以使用迭代器的方法进行操作
		 *   可是，迭代器中没有这样的方法。
		 *   
		 *   所以引入Iterator的子接口ListItercator，允许按任意方向遍历链表，可以在迭代中对列表进行修改
		 *   该列表迭代器只有List接口才有,而且这个迭代器可以完成在迭代过程中的增删改查。
		 *   不只是hasNext,还有hasPriorous，可以逆向遍历
		 *   
		 */
//		Iterator it = list.iterator();
		ListIterator it = list.listIterator();//可以在参数中添加索引，表示从索引处开始迭代
		while(it.hasNext()){
			Object obj = it.next();//ConcurrentModificationException：在迭代过程中不可以线性修改集合，否则会发生此异常
			if("baixingyu2".equals(obj)){
//				list.add("java");
				it.set("java");
			}
		}
		System.out.println(list);
	}

}
