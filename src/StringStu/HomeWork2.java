package StringStu;

import java.util.Arrays;

public class HomeWork2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ���ַ���������Ȼ˳������
		 * ˼·:
		 * 1.����,���Ƕ�����������
		 * 2.�����е�Ԫ�����ַ����С����԰��ַ���ת������
		 * 3.����������
		 * 4.������������ת���ַ���
		 */
		String str = "abcisaba";
		str = sortStringByChar(str);
		System.out.println("str = "+str);

	}

	public static String sortStringByChar(String str) {
		//���ַ���ת������
		char[] chs = getArray(str);
		//����������
		sort(chs);
		//������ת���ַ���
		return new String(chs);
	}

	private static void sort(char[] chs) {
		Arrays.sort(chs);
	}

	private static char[] getArray(String str) {
		return str.toCharArray();
	}

}
