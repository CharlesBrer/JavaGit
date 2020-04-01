package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import practice.domain.Student;

public class ListDemo {
	/*
	 * List 有序的，带索引，通过索引可以精确操作集合中的元素，元素可以重复
	 *    --- 支持了增删改查：curd
	 * 使用List解决插入元素的问题，用add方法追加。
	 * List增加了对角标所在位置的操作，比如插入，删除，get获取
	 * List获取：一种是迭代获取，一种是get获取
	 * List修改：set方法，用于修改所在角标的元素。
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		
		//添加元素
		list.add(new Student("hello1",21));
		list.add(new Student("hello2",22));
		list.add(new Student("hello3",23));
		//插入元素
		list.add(1,new Student("hello4",25));//在指定的位置插入元素，其余数据后移
		
		for (Iterator it = list.iterator(); it.hasNext();) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}
	}
}
