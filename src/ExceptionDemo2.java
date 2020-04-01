/**
 * 异常的发生细节
 * 
 * 举例：买买水果可能会有假钞，定义程序需要健壮性
 * 
 * 加入一些逻辑判断，
 * jvm提供的打包分析不够清晰，需要自己实现功能
 * */
class Demo{
	int getElem(int[] arr,int index)
	{
		if(arr==null) throw new NullPointerException("数组不存在");
		if(index<0 || index >= arr.length)
		{
			//该条件满足，功能无法继续运算，需要抛出异常，结束功能
			//1.创建一个异常对象，封装一些提示
			//throw异常
			throw new ArrayIndexOutOfBoundsException("错误的角标"+index+"索引在数组中不存在");
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
