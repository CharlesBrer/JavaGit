package BasicClassTypeStu;

public class BasicDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * װ��Ͳ���
		 * ��Ϊ1.5�Ժ��װ���������.
		 */
//		Integer i = new Integer(4);
		Integer i = 4;  //�Զ�װ��,Ϊ�˼���д,��������ֵ��ɶ���Integer i = Integer.valueOf(4);
		i = i + 5; //��ʱΪ������ֵ���㣬Ϊ�Զ����䣬��i����ת���˻������ݣ� i.inValue() + 5; �ӷ�������ٴ�װ��
		
	//�Զ�����װ��ϸ��
		Integer a = 3;
		Integer b = 3;
		//��jdk1.5�Զ�װ��ʱ�������ֵ��byte��Χ֮�ڣ������´�������ռ䣨-128��127��������ʹ��ԭ�����еĿռ�
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		Integer x = new Integer(128);
		Integer y = new Integer(128);
		System.out.println(x==y);
		System.out.println(x.equals(y));
	}

}
