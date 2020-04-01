package StringStu;

public class Str2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1.字符串是一个对象，他的方法必然是围绕操作这个对象的数据而定义。
		 * 2.字符串的功能
		 *  2.1 多少个字符
		 *      int length()
		 *  2.2 字符的位置，如果字符不存在，返回-1
		 *      int codePointAt(int ch,int fromIndex)
		 *  2.3 获取所需位置上的字符
		 *      char charAt(int i)
		 *  2.4 获取部分串 
		 *      String substring(int begin,int end)
		 * */
		String str = "abade";
		int len =str.length();
		System.out.println("length= "+len);
		int i = str.indexOf('a');
		int i2 = str.indexOf('a',str.indexOf('a')+1);
		System.out.println(i2);
		System.out.println("indexof "+i);
		char ch = str.charAt(3);
		System.out.println("3 is "+ch);
		String sub = str.substring(1, 5);
		System.out.println("0 to 5 is "+sub);
	}

}
