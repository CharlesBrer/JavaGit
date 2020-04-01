
/**
 *java的自带异常可能不会很好用 
 *需要定义完全属于自己的异常类的时候，就需要这里的知识
 *之前的异常都是对类描述，将问题封装成对象。
 *可以把自己所需要的问题进行类的描述
 */

/*自定义异常、描述person的年龄非法
 * 只要是项目的Person年龄出现非法值就会发生异常
 * 
 * 
 * 
 * 若是不继承异常超类会产生编译错误，发现Throwable是所有异常的超类，是异常体系的顶层类
 *   Throwable下有Rrror和Exception两个子类
 *   
 *   必须继承Throwable或者继承其子类，才可以被抛出。
 * 	继承选择更为确切的exception
 *  
 * 
 * 随后出现问题——需要捕获或声明异常才能抛出
 * 
 * 
 * */
class NoAgeException extends RuntimeException{
	/*java给其他异常类提供了信息和阅读 */
	NoAgeException()
	{
		super();
	}
	NoAgeException(String message)
	{
		super(message);
	}
}//自定义异常，直接继承RuntimeException，随后构造方法中用super向上传递参数。
public class DeFineExceptionbySelf {

}
