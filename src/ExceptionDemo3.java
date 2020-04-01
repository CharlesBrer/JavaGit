
class Person
{
	private String name;
	private int age;
	Person(String name,int age){
		if(age<0 || age>200)
		{
			/*
			 * 使用return可以编译运行，但是问题没有终止，这是不合理的，因为在对象初始化中出了问题，不可以继续执行操作。
			 * 应当将问题暴露出来给使用者
			 */
			throw new NoAgeException(age+",年龄数值非法");
		}
		
		this.name = name;
		this.age = age;
	}
	//重写toString
	public String toString(){
		return "person[name="+name+"，age="+age+"]";
	}
}
public class ExceptionDemo3 {
public static void main1(String[] args) {
	Person p = new Person("小明",1000);
	System.out.println(p);
}
	
}
