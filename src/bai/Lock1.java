package bai;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class Resource{
	String name;
	final Lock lock = new ReentrantLock();//资源本身的锁
	final Condition pro = lock.newCondition();
	final Condition con = lock.newCondition();//生产者和消费者的监视器
	
	Object[] item = new Object[100];//物品数组
	int proptr,conptr,count;//生产游标，消费游标，数目
	
	public void produce(Object x){
		lock.lock();
		try{
			while(count == item.length)//判断是否满了
				try{pro.await();}catch(InterruptedException e){}//线程休眠
			item[proptr] = x;//把生产的物品放入数组
			System.out.println("做了一个");
			if(++proptr == item.length) proptr=0;//边界循环
			++count; //计数器自增
			con.signal();//唤醒一个消费者
		}
		finally{
			lock.unlock();
		}
	}
	
	public void consume(){
		lock.lock();
		try{
			while(count == 0)//判断是否满了
				try{con.await();}catch(InterruptedException e){}//线程休眠
			if(--conptr == 0) conptr=item.length;//边界循环
			--count; //计数器自增
			System.out.println("吃了一个");
			pro.signal();//唤醒一个消费者
		}
		finally{
			lock.unlock();
		}
	}
}
class Producer implements Runnable{
	Object x = new Object();
	Resource r;
	Producer(Resource r){
		this.r= r;
	}
	public void run(){
		r.produce(x);
	}
}
class Consumer implements Runnable{
	Resource r;
	Consumer(Resource r){
		this.r= r;
	}
	public void run(){
		r.consume();
	}
}

class Lock1{
	public static void main(String[] args) {
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		t1.start();
		t2.start();
	}
}