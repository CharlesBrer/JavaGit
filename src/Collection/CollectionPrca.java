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
		 * �������д洢�Զ������
		 */
		//1.�������϶���
		Collection coll = new ArrayList();
		//2.��Ӿ���ѧ��Ԫ��
		Student stu = new Student("Lisi",21);
		coll.add(stu);
		coll.add(new Student("zhangsan",24));
		coll.add(new Student("wangwu",27));
		/*
		 * �����д洢�������ã��������һ���������β����ط���������������ͬ�Ķ������Ӳ����ط�
		 * �ж�������ͨ����������ɵ�
		 */
		
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student.getName());
		}
	}

}
