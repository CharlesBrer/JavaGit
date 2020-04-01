package ThreadStu;
//创建线程的第二种方式
class Demo1 implements Runnable{
	private String name;
	Demo1(String name){
		this.name = name;
	}
	//覆盖接口中的run
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("name:"+name+" "+Thread.currentThread().getName());
			}
	}
}

public class DemoRunnable {
	public static void main(String[] args) {
		//此时创建的d不是线程对象
		Demo1 d = new Demo1("Look");
		//将创建好的实现Runnable的对象引用作为参数加入Thread的构造方法中
		Thread t = new Thread(d);
		t.start();//启动线程
	}
}
