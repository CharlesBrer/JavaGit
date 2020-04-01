/**
	异常发生通常有处理方式
	错误发生后不会有处理方式
	error的发生往往是jvm系统发生了问题，反馈给jvm
	无法针对处理，只能修正代码
	 
*/
class ExceptionDemo
{
	public static void main1(String[] args) {
		int[] arr = new int[10];
		System.out.println(arr[0]);
	}
}