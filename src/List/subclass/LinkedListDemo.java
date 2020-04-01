package List.subclass;

import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ArrayList是顺序表结构，不是线程安全的。所以速度较快，效率更高。
		 * Vector也是顺序表结构，是线程安全的，是同步的，所以必定会引起效率变低的问题。
		 * LinkedList是链表结构，不同步的，增删的速度很快，但是遍历会慢一些。
		 * 
		 * LinkList可用于堆栈，队列
		 * 堆栈：后进先出。Last in First Out LiFo；
		 * 队列：先进先出。Last in Last Out LILO；
		 * 
		 * 特有方法：围绕头尾添加删除
		 * addFirst() addLast()
		 * getFirst() getLast()
		 * removeFirst() removeLast()
		 */
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		System.out.println("link="+link);
		
		//删除的时候必须是非空
		while(!link.isEmpty()){
			System.out.println(link.removeLast());
		}
	}


}
