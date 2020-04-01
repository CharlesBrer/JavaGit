package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ������
		 * add(Object) �����������Ԫ��
		 * remove(Object) ɾ�������е�Ԫ��
		 * contains(Object) �жϼ������Ƿ������Ԫ��
		 * isEmpty() 		�п�
		 * clear() 			���
		 * 
		 * adddAll(Collection) ������������ӵ����ü�����
		 * removeAll(Collection) ɾ������
		 * retainAll(Collection) �������
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
