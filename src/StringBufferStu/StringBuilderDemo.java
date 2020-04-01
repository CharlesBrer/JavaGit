package StringBufferStu;

public class StringBuilderDemo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * StringBuilder和StringBuffer的区别
		 *  StringBuffer是线程安全的，由于存在了同步加载，所以单线程下效率会低一些，适合多线程访问。
		 *  StringBuilder不保证同步，如果有可能，尽量使用StringBuilder，效率会高一些。
		 */
	}
}
