package StringBufferStu;

public class StringBufferTest {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ��һ��int[]�е�Ԫ��ת�����ַ��� ��ʽ[34,12,89,68]
		 */
		int[] arr = {34,12,89,68};
		String str = toStringByString(arr);
		String str2 = toStringByStringBuffer(arr);
		System.out.println(str);
		System.out.println(str2);
	}
	/**
	 * �ڻ����������۶������ݣ�ʲô�����Ͳ���Ҫ��ֻҪ���ձ���ַ����Ϳ���StringBuffer���������
	 * ��ʹ��String��������ǣ�String����ÿ�θı䶼���½�һ�����������˷��ڴ档
	 * @param arr
	 * @return
	 */
	public static String toStringByStringBuffer(int[] arr) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				sb.append(arr[i]).append(",");
			}else{
				sb.append(arr[i]).append("]");
			}
		}
		return sb.toString();
	}

	private static String toStringByString(int[] arr) {
		// ���ַ���
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
		if(i!=arr.length-1){
			s += arr[i]+",";
		}else{
			s += arr[i]+"]";
		}
	}
		return s;
	}
}

