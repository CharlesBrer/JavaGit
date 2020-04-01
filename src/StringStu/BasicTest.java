package StringStu;

import java.util.Arrays;

public class BasicTest {

	public static void main(String[] args) {
		/*
		 * �ַ�����������
		 */
		String[] strs = { "abc", "nba", "cctv", "hello" };
		printArray(strs);
		sortString(strs);
		printArray(strs);
		/**
		 *�ַ������ֵĴ��� 
		 *˼·��˼·�޷Ǿ�����һ���ַ����в�����һ���ַ���-indexOf��
		 *    1.���ҵ���һ�γ��ֵ�ָ���ַ��������ҵڶ���,�Դ�����
		 *    2.�����ٴ�ͷ��ʼ��ֻ��Ҫ�ӵ�һ�γ��ֵ�λ�ü���Ҫ�ҵ��ַ�����λ�ü��ϳ��ȵ�λ����������һ�γ��ֵ�λ��
		 */
		 String str = "hakabcsdoaebcooibsabcofhasodasbdwabcabc";
		 String key = "abc";
		 int count = getKeyCount(str,key);
		 System.out.println("count="+count);
		 
		 String s1 = "BaiXingyu";
		 printStringByLength(s1);
		 
		
	}
	/**
	 * ͨ��������������forǶ��ѭ��
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
	 *�ַ������ֵĴ��� 
	 *˼·��˼·�޷Ǿ�����һ���ַ����в�����һ���ַ���-indexOf��
	 *    1.���ҵ���һ�γ��ֵ�ָ���ַ��������ҵڶ���,�Դ�����
	 *    2.�����ٴ�ͷ��ʼ��ֻ��Ҫ�ӵ�һ�γ��ֵ�λ�ü���Ҫ�ҵ��ַ�����λ�ü��ϳ��ȵ�λ����������һ�γ��ֵ�λ��
	 */
	public static int getKeyCount(String str, String key) {
		//1.�����������¼ÿһ���ҵ���key��λ�á�
		int index = 0;
		//2.������ֵĴ�����
		int count = 0;
		//3.����ѭ��
		while((index = str.indexOf(key, index))!=-1){
			//ÿѭ��һ�ξ�Ҫ��ȷ�´εĲ���λ��
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
	 * �ַ����������� ˼·�� 1.int��������ѡ���ð������ 2.�ַ�������ͬ�� 3.forǶ��ѭ�� 4.ѭ���н���Ԫ�ش�С�Ƚ�
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
	/*����Ԫ��λ���û�
	 * */
	public static void swap(String[] strs, int i, int j) {
		String temp = strs[i];
		strs[i] = strs[j];
		strs[j] = temp;
	}
	
}
