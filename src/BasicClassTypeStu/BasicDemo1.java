package BasicClassTypeStu;

public class BasicDemo1 {
	public static void main(String[] args) {
		/*
		 * 场景：获取用户输入的数字数据，可是得到的是字符串。
		 * 如果想对字符串中的数字进行运算，必须将字符串转换成数字。
		 * Java中提供了相应的封装对象，可以提供更多操作基本数值的方法
		 *  byte -> Byte
		 *  short -> Short
		 *  int -> Integer
		 *  long -> Long
		 *  float -> Float
		 *  double -> Double
		 *  boolean -> Boolean
		 *  char -> Character
		 *  特点：
		 *  1.在基本数据类型和字符串之间进行转换
		 *  2.
		 *  
		 *  讲Integer，操作方法都差不多---
		 */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		//转换成二进制(Binary)十六(Hex)八(Octal)
		//字符串转化成基本数值 --xxx.parseXxx(String) 会出现NumberFormatException
		// xxx.parseXxx(String,int),可以指定进制，但是前面的字符串必须符合提供的进制。
		int a = Integer.parseInt("123");
		System.out.println(a+2);
		//基本数值转成字符串
		System.out.println(Integer.toString(100)+2);
		//基本数值 <----> 包装对象
		 Integer i = new Integer(4);
		 new Integer("4");
		 Integer ii = Integer.valueOf(4);
		 
		 int num = i.intValue();
	}
}
