/**
 * �쳣�ķ���ϸ��
 * 
 * ����������ˮ�����ܻ��мٳ������������Ҫ��׳��
 * 
 * ����һЩ�߼��жϣ�
 * jvm�ṩ�Ĵ������������������Ҫ�Լ�ʵ�ֹ���
 * */
class Demo{
	int getElem(int[] arr,int index)
	{
		if(arr==null) throw new NullPointerException("���鲻����");
		if(index<0 || index >= arr.length)
		{
			//���������㣬�����޷��������㣬��Ҫ�׳��쳣����������
			//1.����һ���쳣���󣬷�װһЩ��ʾ
			//throw�쳣
			throw new ArrayIndexOutOfBoundsException("����ĽǱ�"+index+"�����������в�����");
		}
		
		int elem = arr[index];
		return elem;
	}
}
public class ExceptionDemo2 {
	public static void main1(String[] args) {
		Demo d = new Demo();
		int[] arr = {34,12,47};
		int num = d.getElem(null, 4);
		System.out.println("num"+num);
		
	}
}
