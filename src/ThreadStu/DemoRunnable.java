package ThreadStu;
//�����̵߳ĵڶ��ַ�ʽ
class Demo1 implements Runnable{
	private String name;
	Demo1(String name){
		this.name = name;
	}
	//���ǽӿ��е�run
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("name:"+name+" "+Thread.currentThread().getName());
			}
	}
}

public class DemoRunnable {
	public static void main(String[] args) {
		//��ʱ������d�����̶߳���
		Demo1 d = new Demo1("Look");
		//�������õ�ʵ��Runnable�Ķ���������Ϊ��������Thread�Ĺ��췽����
		Thread t = new Thread(d);
		t.start();//�����߳�
	}
}
