package StringStu;

public class Str1 {
	public static void main(String[] args) {
		String s3 = "head";
		String s4 = new String("head");
		//------------两种方式创建String
		System.out.println(s3 == s4);//为假
		System.out.println(s3.equals(s4));//为真--String类自己重写了equals方法，判断依据是对象的内容而不是地址
		//--------运行后，一个会为假。一个为真
		/*
		 * s3创建，在内存中只有一个对象
		 * s4创建，在内存中出现了新对象，由于是new
		 * 
		 * --但是一般开发很少用第二种方法，除非往里传字符数组或者字节数组
		 * */
	}
}
