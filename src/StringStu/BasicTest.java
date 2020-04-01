package StringStu;

import java.util.Arrays;

public class BasicTest {

	public static void main(String[] args) {
		/*
		 * 字符串数组排序
		 */
		String[] strs = { "abc", "nba", "cctv", "hello" };
		printArray(strs);
		sortString(strs);
		printArray(strs);
		/**
		 *字符串出现的次数 
		 *思路：思路无非就是在一个字符串中查找另一个字符串-indexOf。
		 *    1.查找到第一次出现的指定字符串，查找第二个,以此类推
		 *    2.无需再从头开始，只需要从第一次出现的位置加上要找的字符串的位置加上长度的位置向后查找下一次出现的位置
		 */
		 String str = "hakabcsdoaebcooibsabcofhasodasbdwabcabc";
		 String key = "abc";
		 int count = getKeyCount(str,key);
		 System.out.println("count="+count);
		 
		 String s1 = "BaiXingyu";
		 printStringByLength(s1);
		 
		
	}
	/**
	 * 通过分析，发现是for嵌套循环
	 * @param s1
	 */
	public static void printStringByLength(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			
			for (int start = 0, end =s1.length() - i ; end <= s1.length(); start++,end++) {
				System.out.print(s1.substring(start,end)+" ");
			}
			System.out.println();
		}
		
	}
	/**
	 *字符串出现的次数 
	 *思路：思路无非就是在一个字符串中查找另一个字符串-indexOf。
	 *    1.查找到第一次出现的指定字符串，查找第二个,以此类推
	 *    2.无需再从头开始，只需要从第一次出现的位置加上要找的字符串的位置加上长度的位置向后查找下一次出现的位置
	 */
	public static int getKeyCount(String str, String key) {
		//1.定义变量，记录每一次找到的key的位置。
		int index = 0;
		//2.定义出现的次数。
		int count = 0;
		//3.定义循环
		while((index = str.indexOf(key, index))!=-1){
			//每循环一次就要明确下次的查找位置
			index +=  key.length();
			count++;
		}	
		return count;
	}
	
	private static void printArray(String[] strs) {
		for (String string : strs) {
			System.out.print(string+" ");		
			}
		System.out.println();
	}

	/**
	 * 字符串数组排序 思路： 1.int数组排序，选择和冒泡排序。 2.字符串排序同理 3.for嵌套循环 4.循环中进行元素大小比较
	 * */
	public static void sortString(String[] strs) {
//		for (int i = 0; i < strs.length; i++) {
//			for (int j = i + 1; j < strs.length; j++) {
//				if (strs[i].compareTo(strs[j])>0) {
//					swap(strs, i, j);
//				}
//			}
//		}
		Arrays.sort(strs);
	}
	/*数组元素位置置换
	 * */
	public static void swap(String[] strs, int i, int j) {
		String temp = strs[i];
		strs[i] = strs[j];
		strs[j] = temp;
	}
	
}
