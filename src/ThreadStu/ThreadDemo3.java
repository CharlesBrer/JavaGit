package ThreadStu;
/*
 * ��Ʊ
 * 
 * ��Ʊ�Ķ�����Ҫͬʱִ�У�������Ҫʹ�ö��̼߳�����
 * */


class Ticket implements Runnable{
	//����Ʊ��
	private int tickets = 1000;
	private Object obj = new Object();
	//��Ʊ�������̶߳���
	//�߳�����ͨ����ѭ���ṹ
	public void run(){
		while(true)
			{
			synchronized(obj){
			if(tickets>0){
				
//				try{ Thread.sleep(10); } catch(InterruptedException e){}
				//���ܻῴ�����󣬳��ֶ��̰߳�ȫ����
				System.out.println(tickets--+"..."+Thread.currentThread().getName());
			}
			}
		}
	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {
		Ticket t =new Ticket();
		//����4���̶߳���
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
