
class Resource{
		String name;
		int count;
		
		
		//produce
		public synchronized void set(String name){
			
				this.name = name + count++;
			System.out.println(Thread.currentThread().getName()+"pro----->"+name);
			count++;
			
		}
		//consume
		public synchronized void out(){
			
			System.out.println(Thread.currentThread().getName()+"con----->"+name);
			
		}
	}
class Producer implements Runnable{
	Resource r;
	Producer(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
			r.set("Bread");
		}
	}
}
class Consumer implements Runnable{
	Resource r;
	Consumer(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
			r.out();
		}
	}
}


public class Demo11 {
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
