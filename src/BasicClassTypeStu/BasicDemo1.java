package BasicClassTypeStu;

public class BasicDemo1 {
	public static void main(String[] args) {
		/*
		 * ��������ȡ�û�������������ݣ����ǵõ������ַ�����
		 * �������ַ����е����ֽ������㣬���뽫�ַ���ת�������֡�
		 * Java���ṩ����Ӧ�ķ�װ���󣬿����ṩ�������������ֵ�ķ���
		 *  byte -> Byte
		 *  short -> Short
		 *  int -> Integer
		 *  long -> Long
		 *  float -> Float
		 *  double -> Double
		 *  boolean -> Boolean
		 *  char -> Character
		 *  �ص㣺
		 *  1.�ڻ����������ͺ��ַ���֮�����ת��
		 *  2.
		 *  
		 *  ��Integer���������������---
		 */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		//ת���ɶ�����(Binary)ʮ��(Hex)��(Octal)
		//�ַ���ת���ɻ�����ֵ --xxx.parseXxx(String) �����NumberFormatException
		// xxx.parseXxx(String,int),����ָ�����ƣ�����ǰ����ַ�����������ṩ�Ľ��ơ�
		int a = Integer.parseInt("123");
		System.out.println(a+2);
		//������ֵת���ַ���
		System.out.println(Integer.toString(100)+2);
		//������ֵ <----> ��װ����
		 Integer i = new Integer(4);
		 new Integer("4");
		 Integer ii = Integer.valueOf(4);
		 
		 int num = i.intValue();
	}
}
