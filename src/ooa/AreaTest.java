package ooa;
//shape��һ��ͼ���࣬��ʾ��һ����״
//��Ȼ��һ����״���ͱ��������������shape���к���һ��������ķ��������ǲ��ṩ�����ʵ�֣����ǽ����������̳к�ʵ��
//�������������Բ�����඼���ܴ������쳣���ڹ����ʱ��Ӧ�������쳣����ֹ����

//�Զ��崫������쳣--�߳���뾶�쳣
class WrongLengthException extends RuntimeException{
	public WrongLengthException() {
		super();
	}
	public WrongLengthException(String message){
		super(message);
	}
}


abstract class Shape implements Runnable{
	double area;
	protected final double pi = 3.14;
	
	abstract double getArea();//�ṩһ��������ĺ����������ڲ�֪��������״����ʵ�֣���������
	
	public void run(){
		System.out.println(this.getArea()+"....."+Thread.currentThread().getName());
	}
	
}//������̵߳�֪ʶ�Ա�鿴���
class Circle extends Shape{
	private int r;
	double getArea(){
	  return area = r*r*pi; 
	}//ʵ�ָ���shape�е�getArea����
	
	//ΪԲ����д���췽��
	Circle(int r) {
		//�ڹ����ʱ����ܻ���ֳ��Ȳ��Ϸ��쳣������Ҫ���
		if(r <= 0){
			throw new WrongLengthException("����İ뾶"+r+"���Ϸ�����ǣ�");
		}
		this.r = r;//Բ�����ʱ������а뾶
	}
	int getD(){
		return r*2;//��ȡԲ��ֱ��
	}
}
class Triangle extends Shape{
	private int bottom;
	private int height;
	double getArea(){
		  return area = height*bottom/2.0;
		}//ʵ�ָ���shape�е�getArea����
	Triangle(int bottom,int height){//�����ζ����ʱ����Ҫ�е׺͸�
		if(bottom <= 0 || height <=0){
			throw new WrongLengthException("����Ŀ��߲��Ϸ�����ǣ�");
		}
		this.bottom = bottom;
		this.height = height;
	}
}

class AreaTest {
	public static void main(String[] args) {
		Triangle t = new Triangle(3,4);
		Circle c = new Circle(3);
		//��������ͨ���ã������Ӧ����
		//�����Ƕ�̬��Ӧ��
		Shape s1 = new Triangle(-3,4);//��ʱ���Ϸ����ᱻ��ֹ
		Shape s2 = new Circle(-1);
		/* 1.���ø���ķ�������������ϸ�ڣ������ע����
		 * 2.ֻ��ʵ�ָ���ķ���������ʹ����������ⷽ���������ٴ�����ת��
		 *   ���磺��Circle�������һ��ֱ�����ԣ������circle������ӻ�ȡֱ���ķ���getD();
		 * */
		
		
		
		
		//��̬ʱ��ʹ�ã����̻߳ᱻ�쳣��ֹ
		System.out.println(t.getArea());
		System.out.println(c.getArea());
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
		//System.out.println(s2.getD());  --���ǲ�����ת�ͣ��ͻ���ֱ�����ʾs2��û��getD������ԭ����s2��Shape�ࡣ
		System.out.println(( (Circle)s2 ).getD());//�˴���s2��������ת�ͣ��Ͳ�����ֱ���ԭ����s2������ת����Circle��
	}
}	
