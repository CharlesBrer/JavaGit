package ThreadStu;
/*
 * 售票
 * 
 * 售票的动作需要同时执行，所以需要使用多线程技术。
 * */


class Ticket implements Runnable{
	//描述票数
	private int tickets = 1000;
	private Object obj = new Object();
	//售票动作是线程动作
	//线程任务通常有循环结构
	public void run(){
		while(true)
			{
			synchronized(obj){
			if(tickets>0){
				
//				try{ Thread.sleep(10); } catch(InterruptedException e){}
				//可能会看到错误，出现多线程安全问题
				System.out.println(tickets--+"..."+Thread.currentThread().getName());
			}
			}
		}
	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {
		Ticket t =new Ticket();
		//创建4个线程对象
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
