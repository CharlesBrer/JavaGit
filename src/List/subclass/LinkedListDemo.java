package List.subclass;

import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ArrayList��˳���ṹ�������̰߳�ȫ�ġ������ٶȽϿ죬Ч�ʸ��ߡ�
		 * VectorҲ��˳���ṹ�����̰߳�ȫ�ģ���ͬ���ģ����Աض�������Ч�ʱ�͵����⡣
		 * LinkedList������ṹ����ͬ���ģ���ɾ���ٶȺܿ죬���Ǳ�������һЩ��
		 * 
		 * LinkList�����ڶ�ջ������
		 * ��ջ������ȳ���Last in First Out LiFo��
		 * ���У��Ƚ��ȳ���Last in Last Out LILO��
		 * 
		 * ���з�����Χ��ͷβ���ɾ��
		 * addFirst() addLast()
		 * getFirst() getLast()
		 * removeFirst() removeLast()
		 */
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		System.out.println("link="+link);
		
		//ɾ����ʱ������Ƿǿ�
		while(!link.isEmpty()){
			System.out.println(link.removeLast());
		}
	}


}
