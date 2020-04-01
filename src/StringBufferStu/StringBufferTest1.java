package StringBufferStu;
/**
 * 什么是stringBuffer:
 * 一个字符串缓冲区，就是一个容器
 * @author cheney
 *原理：字符串缓冲区的内部是由数组实现的，数组虽然不可以长度可变，但是可以通过重新声明数组的方法。
 */

public class StringBufferTest1 {
	/*
	 * 1.字符串缓冲区，一个容器
	 * 2.长度可变，任意类型都可以，但是将任意数据都转换成了字符串进行存储
	 * 3.容器对象提供了很多对容器中数据的操作方法：比如添加删除查找修改等。
	 * 4.必须所有的数据最终变成一个字符串
	 * 
	 * 和数组最大不同是，数组存储完可以单独操作每一个元素，每个元素都是独立的。
	 * 字符串缓冲区会把所有添加的元素变成字符串，而且最后会变成一个总的字符串，数据之间不独立。
	 */
	public static void main(String[] args) {
		//1.创建一个字符串缓冲区对象
	StringBuffer sb = new StringBuffer();//空参的容量有16个字符
		//2.追加数据,不断添加数据后，要对缓冲区的最后的数据操作，必须转成字符串才可以
	sb.append(true).append("haha").append(1234);
	sb.insert(2, "hello");//在指定位置插入元素，而不是在结尾追加
	sb.delete(1, 4);//删除元素
	sb.replace(1, 9, "替换过的元素");//替换元素
	sb.reverse(); //翻转字符串
	sb.setLength(2);//设置长度，但是会将长度以外的内容删掉
	
	
	String s = "String1";
	String s1 = new StringBuffer().append("String").append(1).toString();//字符串String类型的底层原理
	System.out.println(s1+" "+s);
	}
	
	

}
