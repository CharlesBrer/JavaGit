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
 * 缉毒的功能不一定只有狗可以做到，所以可以将这个功能进行抽取。
 * 
 * abstract class Drug{
 * 	public void drug(){}
 * }
 * 此时发现不能多继承，所以改成接口
 * */
interface Drug{
	public void drug();
}//实现缉毒的接口
class DrugDog extends Dog implements Drug {
	public void say(){}
	public void sleep(){}
	public void drug(){} 
}

public class AbstractAndInterface {
	public static void main(String[] args) {
		
	}
}
