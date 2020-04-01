package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import practice.domain.Student;

public class CollectionPrca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 往集合中存储自定义对象
		 */
		//1.创建集合对象
		Collection coll = new ArrayList();
		//2.添加具体学生元素
		Student stu = new Student("Lisi",21);
		coll.add(stu);
		coll.add(new Student("zhangsan",24));
		coll.add(new Student("wangwu",27));
		/*
		 * 集合中存储的是引用，所有添加一个引用两次才是重符，而两个属性相同的对象的添加不算重符
		 * 判断依据是通过方法来完成的
		 */
		
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student.getName());
		}
	}

}
