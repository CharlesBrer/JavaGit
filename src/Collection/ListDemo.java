package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import practice.domain.Student;

public class ListDemo {
	/*
	 * List ����ģ���������ͨ���������Ծ�ȷ���������е�Ԫ�أ�Ԫ�ؿ����ظ�
	 *    --- ֧������ɾ�Ĳ飺curd
	 * ʹ��List�������Ԫ�ص����⣬��add����׷�ӡ�
	 * List�����˶ԽǱ�����λ�õĲ�����������룬ɾ����get��ȡ
	 * List��ȡ��һ���ǵ�����ȡ��һ����get��ȡ
	 * List�޸ģ�set�����������޸����ڽǱ��Ԫ�ء�
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		
		//���Ԫ��
		list.add(new Student("hello1",21));
		list.add(new Student("hello2",22));
		list.add(new Student("hello3",23));
		//����Ԫ��
		list.add(1,new Student("hello4",25));//��ָ����λ�ò���Ԫ�أ��������ݺ���
		
		for (Iterator it = list.iterator(); it.hasNext();) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}
	}
}
