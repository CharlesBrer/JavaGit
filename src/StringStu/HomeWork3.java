package StringStu;

public class HomeWork3 {
	public static void main(String[] args) {
		/**
		 * String���trim()
		 * 1.trim�������ǣ�����ɾ����ǰ��ո���ַ���
		 * 2.trim��ʲôʱ���ã����������û���
		 * 3.ģ��һ��trim����
		 */
		String s = "123 ";
		System.out.println(myTrim(s));
	}
	
	public static String myTrim(String str){
		//1������ͷβ
		int start =0 ; int end = str.length()-1;
		//2.��ȡͷ�հ�
		while(str.charAt(start)==' ' && start <= end) start++;
		while(str.charAt(end)==' ' && start <= end) end--;
		return str.substring(start,end+1);
	}
}
