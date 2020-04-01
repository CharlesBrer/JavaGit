package ThreadStu;

class Test implements Runnable{
	 boolean flag;
	Test(boolean flag)
	{
		this.flag = flag;
	}
	public void run(){
		if(flag)
		{
			while(true){
				synchronized(MyLock.LOCKA){
					System.out.println(Thread.currentThread().getName()+"   if..........lockA");
					synchronized(MyLock.LOCKB){
						System.out.println(Thread.currentThread().getName()+"   if..........lockB");	
					}
				}
			}
		}
		else{
			while(true){
				synchronized(MyLock.LOCKB){
					System.out.println(Thread.currentThread().getName()+"   else..........lockB");
					synchronized(MyLock.LOCKA){
						System.out.println(Thread.currentThread().getName()+"   else..........lockA");
					}
				}
			}
		}
	}
}
//定义一个存储锁对象的类
class MyLock{
	public static final Object LOCKA = new Object();
	public static final Object LOCKB = new Object();
}

public class DeadLockTest {
public static void main(String[] args) {
	Test t1 = new Test(true);
	Test t2 = new Test(false);
	Thread t11 = new Thread(t1);
	Thread t22 = new Thread(t2);
	t11.start(); t22.start();
}
}
//死锁

