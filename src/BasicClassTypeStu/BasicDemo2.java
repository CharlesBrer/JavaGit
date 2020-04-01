package BasicClassTypeStu;

public class BasicDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 装箱和拆箱
		 * 此为1.5以后包装类的新特性.
		 */
//		Integer i = new Integer(4);
		Integer i = 4;  //自动装箱,为了简化书写,将基本数值变成对象：Integer i = Integer.valueOf(4);
		i = i + 5; //此时为基本数值运算，为自动拆箱，将i对象转成了基本数据： i.inValue() + 5; 加法运算后再次装箱
		
	//自动拆箱装箱细节
		Integer a = 3;
		Integer b = 3;
		//在jdk1.5自动装箱时，如果数值在byte范围之内，不会新创建对象空间（-128，127），而是使用原来已有的空间
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		Integer x = new Integer(128);
		Integer y = new Integer(128);
		System.out.println(x==y);
		System.out.println(x.equals(y));
	}

}
