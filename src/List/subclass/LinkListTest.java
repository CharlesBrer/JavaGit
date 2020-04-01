package List.subclass;

import java.util.LinkedList;
public class LinkListTest {
/*
 * 用LinkedList实现堆栈或者队列的数据结构
 * 应该创建堆栈或者队列的数据结构对象，该对象是使用LinkedList实现的。
 */
	public static void main(String[] args) {
		Stack q = new Stack();
		q.myAdd("First");
		q.myAdd("Secend");
		q.myAdd("Third");
		while(!q.isNull()){
			System.out.println(q.myGet());
		}
	}
	
}

/**
 * 定义一个队列数据结构
 * */
class Queue{
	//封装链表数据结构，初始化的时候对链表对象初始化
	private LinkedList link;
	Queue(){
		link = new LinkedList();
	}
	
	public void myAdd(Object obj){
		//内部使用链表
		link.addFirst(obj);
	}
	public Object myGet(){
		return link.removeLast();
	}
	/*
	 *判断队列存在是否为空
	 */
	public boolean isNull(){
		return link.isEmpty();
		}
}

class Stack{//自定义堆栈结构
	private LinkedList link;
	Stack(){
		link = new LinkedList();
	}
	public void myAdd(Object obj){
		link.addFirst(obj);
	}
	public Object myGet(){
		return link.removeFirst();
	}
	public boolean isNull(){
		return link.isEmpty();
		}
}