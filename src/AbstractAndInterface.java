abstract class Dog{
	public abstract void say();
	public abstract void sleep();
}

//class DrugDog extends Dog{
//	public void say(){}
//	public void sleep(){}
//	public void drug(){} 
//}
/*
 * �����Ĺ��ܲ�һ��ֻ�й��������������Կ��Խ�������ܽ��г�ȡ��
 * 
 * abstract class Drug{
 * 	public void drug(){}
 * }
 * ��ʱ���ֲ��ܶ�̳У����Ըĳɽӿ�
 * */
interface Drug{
	public void drug();
}//ʵ�ּ����Ľӿ�
class DrugDog extends Dog implements Drug {
	public void say(){}
	public void sleep(){}
	public void drug(){} 
}

public class AbstractAndInterface {
	public static void main(String[] args) {
		
	}
}
