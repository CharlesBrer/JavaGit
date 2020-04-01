package bai;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class Resource{
	String name;
	final Lock lock = new ReentrantLock();//��Դ�������
	final Condition pro = lock.newCondition();
	final Condition con = lock.newCondition();//�����ߺ������ߵļ�����
	
	Object[] item = new Object[100];//��Ʒ����
	int proptr,conptr,count;//�����α꣬�����α꣬��Ŀ
	
	public void produce(Object x){
		lock.lock();
		try{
			while(count == item.length)//�ж��Ƿ�����
				try{pro.await();}catch(InterruptedException e){}//�߳�����
			item[proptr] = x;//����������Ʒ��������
			System.out.println("����һ��");
			if(++proptr == item.length) proptr=0;//�߽�ѭ��
			++count; //����������
			con.signal();//����һ��������
		}
		finally{
			lock.unlock();
		}
	}
	
	public void consume(){
		lock.lock();
		try{
			while(count == 0)//�ж��Ƿ�����
				try{con.await();}catch(InterruptedException e){}//�߳�����
			if(--conptr == 0) conptr=item.length;//�߽�ѭ��
			--count; //����������
			System.out.println("����һ��");
			pro.signal();//����һ��������
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