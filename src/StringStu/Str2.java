package StringStu;

public class Str2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1.�ַ�����һ���������ķ�����Ȼ��Χ�Ʋ��������������ݶ����塣
		 * 2.�ַ����Ĺ���
		 *  2.1 ���ٸ��ַ�
		 *      int length()
		 *  2.2 �ַ���λ�ã�����ַ������ڣ�����-1
		 *      int codePointAt(int ch,int fromIndex)
		 *  2.3 ��ȡ����λ���ϵ��ַ�
		 *      char charAt(int i)
		 *  2.4 ��ȡ���ִ� 
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
