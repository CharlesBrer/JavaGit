package StringStu;

public class Str1 {
	public static void main(String[] args) {
		String s3 = "head";
		String s4 = new String("head");
		//------------���ַ�ʽ����String
		System.out.println(s3 == s4);//Ϊ��
		System.out.println(s3.equals(s4));//Ϊ��--String���Լ���д��equals�������ж������Ƕ�������ݶ����ǵ�ַ
		//--------���к�һ����Ϊ�١�һ��Ϊ��
		/*
		 * s3���������ڴ���ֻ��һ������
		 * s4���������ڴ��г������¶���������new
		 * 
		 * --����һ�㿪�������õڶ��ַ������������ﴫ�ַ���������ֽ�����
		 * */
	}
}
