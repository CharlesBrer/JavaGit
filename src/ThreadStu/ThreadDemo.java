package ThreadStu;

class Demo extends Thread{
	private String name;
	Demo(String name){
		this.name=name;
	}
	
	public void run()
	{
		for(int i=0;i<10;i++){
		System.out.println("name:"+name+" "+Thread.currentThread().getName());
		}
	}
}


class ThreadDemo {
	public static void main(String[] args) {
		Demo d1 = new Demo("Smith");
		Demo d2 = new Demo("Bob");
		d1.start();
		d2.start();
	}
}
