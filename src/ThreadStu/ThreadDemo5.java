package ThreadStu;
/*
 * 多线程中，最为常见的应用案例：生产者-消费者问题：
 * 生产消费同时执行，需要多线程
 * 执行任务不相同，处理资源相同---线程间通信
 * 
 * 1.描述资源
 * 2.描述生产者
 * 3.描述消费者
 * 
 * */
//描述资源，名称和编号，  可以对名称赋值，可以获取商品
class Resource{
	private String name;
	private int count = 1;
	//设置方法
	private boolean flag = false;
	
	public synchronized void set(String name){
		if(flag) try{wait();}catch(InterruptedException e){}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName()+"生产了"+this.name);
		flag = true;
		notify();
}
		
	
	public synchronized void out(){
		if(!flag) try{wait();}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+"消费者"+this.name);
		flag = false;
		notify();
	}
}

//描述生产者
class Producer implements Runnable{
	Resource r;
	//生产者一初始化就有资源，传递到构造函数
	Producer(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
		r.set("面包");
		}
	}
}
//描述消费者
class Consumer implements Runnable{
	Resource r;
	//消费者一初始化就有资源，传递到构造函数
	Consumer(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
			r.out();
			}
	}
}

//1.由于共享一个属性，会出现线程安全问题，可使用同步来解决
//2.但是会出现消费者对一个商品多次消费,连续生产却没有消费--希望生产一个消费一个
//使用等待和唤醒
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
