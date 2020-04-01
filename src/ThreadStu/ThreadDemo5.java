package ThreadStu;
/*
 * ���߳��У���Ϊ������Ӧ�ð�����������-���������⣺
 * ��������ͬʱִ�У���Ҫ���߳�
 * ִ��������ͬ��������Դ��ͬ---�̼߳�ͨ��
 * 
 * 1.������Դ
 * 2.����������
 * 3.����������
 * 
 * */
//������Դ�����ƺͱ�ţ�  ���Զ����Ƹ�ֵ�����Ի�ȡ��Ʒ
class Resource{
	private String name;
	private int count = 1;
	//���÷���
	private boolean flag = false;
	
	public synchronized void set(String name){
		if(flag) try{wait();}catch(InterruptedException e){}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName()+"������"+this.name);
		flag = true;
		notify();
}
		
	
	public synchronized void out(){
		if(!flag) try{wait();}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+"������"+this.name);
		flag = false;
		notify();
	}
}

//����������
class Producer implements Runnable{
	Resource r;
	//������һ��ʼ��������Դ�����ݵ����캯��
	Producer(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
		r.set("���");
		}
	}
}
//����������
class Consumer implements Runnable{
	Resource r;
	//������һ��ʼ��������Դ�����ݵ����캯��
	Consumer(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
			r.out();
			}
	}
}

//1.���ڹ���һ�����ԣ�������̰߳�ȫ���⣬��ʹ��ͬ�������
//2.���ǻ���������߶�һ����Ʒ�������,��������ȴû������--ϣ������һ������һ��
//ʹ�õȴ��ͻ���
public class ThreadDemo5 {
	public static void main(String[] args) {
		Resource r = new Resource();
		
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
	}
}
