package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDetail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		//�洢Ԫ��
		coll.add("abc1");
		/*
		 * 1.�洢����Ķ��Ƕ��������
		 * 2.�����п��Դ洢�����������ͣ����ǲ���ֱ�Ӵ洢���ͣ����Ǵ����˻����������͵İ�װ�࣬������jdk1.5�Ժ���Զ�װ�书��
		 * 3.ȡ�����Ķ���Object����Ҫʹ��Ԫ�����з�����ʱ����Ҫ����ת�͡�
		 */
		
		coll.add("abc2");//Object obj = "abc2"
		coll.add("abc3");//ȡ�����Ķ���Object����Ҫʹ��Ԫ�����з�����ʱ����Ҫ����ת�͡�
		for (Iterator it = coll.iterator(); it.hasNext();) {
			String str = (String)it.next();
			System.out.println(str.length());
		}
	}

}
