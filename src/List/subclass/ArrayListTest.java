package List.subclass;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import practice.domain.Student;

public class ArrayListTest {
	/**
	 * ��Ȼ�����������ǱȽ��鷳��
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ������ȥ��List�����е��ظ�Ԫ��
		 * 
		 * 1.����һ����ʱ����
		 * 2.����ԭ����������������Ԫ�ص���ʱ�����жϴ���
		 * 3.���ڲ��洢�������ڴ洢
		 * 4.�����Ժ���ʱ�����д洢��Ψһ��Ԫ��
		 * 5.�����Ҫ������ԭ��������ԭ������գ�����ʱ�����е�Ԫ����ӵ�ԭ������
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
			//ÿһ��Ԫ�ض�����ʱ�������жϰ�����
			if(!t.contains(obj)){ //������������ʹ�����ʱ����---�ײ�ͨ�������equals�����ж�
				t.add(obj); 
			}
		}
		//Ψһ��Ԫ���Ѿ�����¼����ʱ����
		list.clear();
		list.addAll(t); //��ԭ������գ�������Ԫ�ط��ء�
	}
}
