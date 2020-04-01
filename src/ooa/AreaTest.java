package ooa;
//shape是一个图像父类，表示是一种形状
//既然是一种形状，就必须有面积，所以shape类中含有一个求面积的方法，但是不提供具体的实现，而是交给子类来继承和实现
//在三角形子类和圆形子类都可能存在了异常，在构造的时候，应当发现异常并终止程序

//自定义传入参数异常--边长或半径异常
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
	
	abstract double getArea();//提供一个求面积的函数但是由于不知道具体形状不能实现，交给子类
	
	public void run(){
		System.out.println(this.getArea()+"....."+Thread.currentThread().getName());
	}
	
}//加入多线程的知识以便查看结果
class Circle extends Shape{
	private int r;
	double getArea(){
	  return area = r*r*pi; 
	}//实现父类shape中的getArea方法
	
	//为圆类重写构造方法
	Circle(int r) {
		//在构造的时候可能会出现长度不合法异常，所以要检测
		if(r <= 0){
			throw new WrongLengthException("输入的半径"+r+"不合法，告辞！");
		}
		this.r = r;//圆定义的时候必须有半径
	}
	int getD(){
		return r*2;//获取圆的直径
	}
}
class Triangle extends Shape{
	private int bottom;
	private int height;
	double getArea(){
		  return area = height*bottom/2.0;
		}//实现父类shape中的getArea方法
	Triangle(int bottom,int height){//三角形定义的时候需要有底和高
		if(bottom <= 0 || height <=0){
			throw new WrongLengthException("输入的宽或高不合法，告辞！");
		}
		this.bottom = bottom;
		this.height = height;
	}
}

class AreaTest {
	public static void main(String[] args) {
		Triangle t = new Triangle(3,4);
		Circle c = new Circle(3);
		//以上是普通调用，子类对应子类
		//以下是多态的应用
		Shape s1 = new Triangle(-3,4);//此时不合法，会被终止
		Shape s2 = new Circle(-1);
		/* 1.调用父类的方法，隐藏子类细节，无需关注子类
		 * 2.只能实现父类的方法，不能使用子类的特殊方法，除非再次向下转型
		 *   例如：在Circle类中添加一个直径属性，随后在circle类中添加获取直径的方法getD();
		 * */
		
		
		
		
		//多态时的使用，主线程会被异常终止
		System.out.println(t.getArea());
		System.out.println(c.getArea());
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
		//System.out.println(s2.getD());  --若是不向下转型，就会出现报错，提示s2中没有getD方法，原因是s2是Shape类。
		System.out.println(( (Circle)s2 ).getD());//此处对s2进行向下转型，就不会出现报错，原因是s2的类型转回了Circle。
	}
}	
