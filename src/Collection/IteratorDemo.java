package Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	private static final Collection ArrayList = null;

	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ���ϵ�ȡ����ʽ
		 * ÿ�������ڲ��洢��ʽ��һ��������ȡ���ķ�ʽҲ�᲻һ��������Ҫ���������ݽṹ
		 * �������ֱ�Ӷ����ڼ����У��������̫ǿ�������������Գ�ȡ
		 * ͨ�õ�ʵ�ַ�����ȡԪ��֮ǰ�������пգ��ǿ���ȡ��һ������������� --����
		 */
		//1.�������϶���
		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		//iterator();���Ի�ȡ���������ϵĵ�����
		Iterator it = coll.iterator();
		//ʹ�þ���ĵ�������ȡ�����е�Ԫ��,���ĵ������ķ���
		while(it.hasNext())
			System.out.println(it.next());
		//java.util.NoSuchElementException û������Ԫ�ص��쳣��
		for (Iterator i = coll.iterator(); i.hasNext();) {//��ȡ�����������Ժ��ͷŵ��������ڴ�
			System.out.println(i.next());
		}
	}
	

}
