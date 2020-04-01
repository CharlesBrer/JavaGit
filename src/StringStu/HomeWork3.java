package StringStu;

public class HomeWork3 {
	public static void main(String[] args) {
		/**
		 * String类的trim()
		 * 1.trim的作用是：返回删除了前后空格的字符串
		 * 2.trim是什么时候用：比如输入用户名
		 * 3.模拟一个trim函数
		 */
		String s = "123 ";
		System.out.println(myTrim(s));
	}
	
	public static String myTrim(String str){
		//1，定义头尾
		int start =0 ; int end = str.length()-1;
		//2.获取头空白
		while(str.charAt(start)==' ' && start <= end) start++;
		while(str.charAt(end)==' ' && start <= end) end--;
		return str.substring(start,end+1);
	}
}
