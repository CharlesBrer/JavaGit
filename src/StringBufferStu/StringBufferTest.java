package StringBufferStu;

public class StringBufferTest {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 将一个int[]中的元素转换成字符串 格式[34,12,89,68]
		 */
		int[] arr = {34,12,89,68};
		String str = toStringByString(arr);
		String str2 = toStringByStringBuffer(arr);
		System.out.println(str);
		System.out.println(str2);
	}
	/**
	 * 在缓冲区：无论多少数据，什么了类型不重要，只要最终变成字符串就可以StringBuffer这个容器。
	 * 与使用String的区别就是，String类型每次改变都会新建一个常量，会浪费内存。
	 * @param arr
	 * @return
	 */
	public static String toStringByStringBuffer(int[] arr) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				sb.append(arr[i]).append(",");
			}else{
				sb.append(arr[i]).append("]");
			}
		}
		return sb.toString();
	}

	private static String toStringByString(int[] arr) {
		// 用字符串
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
		if(i!=arr.length-1){
			s += arr[i]+",";
		}else{
			s += arr[i]+"]";
		}
	}
		return s;
	}
}

