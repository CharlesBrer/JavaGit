
class Person
{
	private String name;
	private int age;
	Person(String name,int age){
		if(age<0 || age>200)
		{
			/*
			 * ʹ��return���Ա������У���������û����ֹ�����ǲ�����ģ���Ϊ�ڶ����ʼ���г������⣬�����Լ���ִ�в�����
			 * Ӧ�������Ⱪ¶������ʹ����
			 */
			throw new NoAgeException(age+",������ֵ�Ƿ�");
		}
		
		this.name = name;
		this.age = age;
	}
	//��дtoString
	public String toString(){
		return "person[name="+name+"��age="+age+"]";
	}
}
public class ExceptionDemo3 {
public static void main1(String[] args) {
	Person p = new Person("С��",1000);
	System.out.println(p);
}
	
}
