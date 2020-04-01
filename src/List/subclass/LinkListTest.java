package List.subclass;

import java.util.LinkedList;
public class LinkListTest {
/*
 * ��LinkedListʵ�ֶ�ջ���߶��е����ݽṹ
 * Ӧ�ô�����ջ���߶��е����ݽṹ���󣬸ö�����ʹ��LinkedListʵ�ֵġ�
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
 * ����һ���������ݽṹ
 * */
class Queue{
	//��װ�������ݽṹ����ʼ����ʱ�����������ʼ��
	private LinkedList link;
	Queue(){
		link = new LinkedList();
	}
	
	public void myAdd(Object obj){
		//�ڲ�ʹ������
		link.addFirst(obj);
	}
	public Object myGet(){
		return link.removeLast();
	}
	/*
	 *�ж϶��д����Ƿ�Ϊ��
	 */
	public boolean isNull(){
		return link.isEmpty();
		}
}

class Stack{//�Զ����ջ�ṹ
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