package StringStu;

import java.util.Arrays;

public class HomeWork2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 对字符串进行自然顺序排序
		 * 思路:
		 * 1.排序,但是都是数组排序，
		 * 2.数组中的元素在字符串中。可以把字符串转成数组
		 * 3.对数组排序
		 * 4.将排序后的数组转成字符串
		 */
		String str = "abcisaba";
		str = sortStringByChar(str);
		System.out.println("str = "+str);

	}

	public static String sortStringByChar(String str) {
		//将字符串转成数组
		char[] chs = getArray(str);
		//对数组排序
		sort(chs);
		//将数组转成字符串
		return new String(chs);
	}

	private static void sort(char[] chs) {
		Arrays.sort(chs);
	}

	private static char[] getArray(String str) {
		return str.toCharArray();
	}

}
