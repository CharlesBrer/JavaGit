package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListItercator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("baixingyu1");
		list.add("baixingyu2");
		list.add("baixingyu3");
		list.add("baixingyu4");
		/*
		 * ��ȡ�����е�Ԫ��
		 * �����������Ԫ�ص���baixingyu2����ô����һ���µ�Ԫ��java
		 * �ڵ��������У�ʹ���˼��ϵķ����Լ��Ͻ��в��������µ���������֪�����Ϸ����ı仯�����������ݵĲ�ȷ���ԡ�
		 * 
		 * ������ڵ��������У���ʹ�ü��ϵķ�������Ԫ�ء�
		 *   ��Ҫ������ʱ�򣬿���ʹ�õ������ķ������в���
		 *   ���ǣ���������û�������ķ�����
		 *   
		 *   ��������Iterator���ӽӿ�ListItercator���������ⷽ��������������ڵ����ж��б�����޸�
		 *   ���б������ֻ��List�ӿڲ���,���������������������ڵ��������е���ɾ�Ĳ顣
		 *   ��ֻ��hasNext,����hasPriorous�������������
		 *   
		 */
//		Iterator it = list.iterator();
		ListIterator it = list.listIterator();//�����ڲ����������������ʾ����������ʼ����
		while(it.hasNext()){
			Object obj = it.next();//ConcurrentModificationException���ڵ��������в����������޸ļ��ϣ�����ᷢ�����쳣
			if("baixingyu2".equals(obj)){
//				list.add("java");
				it.set("java");
			}
		}
		System.out.println(list);
	}

}
