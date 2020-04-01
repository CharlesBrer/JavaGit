package BasicClassTypeStu;

import java.util.Arrays;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ��23 9 -4 18 100 7�� ��С�����γ������ַ��� ˼· 1.����Ҫ���飬�����Ҫ��Ԫ��
		 * 2.Ԫ�����ַ����У�Ҫ��ȡ�ַ��������ݣ���ҪString���� 3.���ַ�����ȡ����ֵ��洢��һ��int�����н�������
		 * 4.�ź�������ַ���
		 */
		String numberString = "23 9 -4 18 100 7";
		numberString = sortNumberString(numberString);
		System.out.println("numbers=" + numberString);
	}

	public static String sortNumberString(String numberString) {
		// ��ȡ�ַ����е����֣�ͨ���ո����indexOf�����������ʹ��substring��ȡ
		// ����������鷳����Щ��ֵ֮��ķָ�����ǿո�ͨ���ո���ַ������룬���������Ķ����������ݵ��ַ�����
		// һ���ַ���ͨ���ָ����˶���ַ���
		String[] strs = numberString.split(" ");
		// ����ֱ�Ӷ��ַ������д�С������Ϊ����ִ��󣬱���ת������
		// ���ַ�������ת����int����
		int[] nums = parseIntArray(strs);
		// ����������
		Arrays.sort(nums);
		// ������ת���ַ���
		return toString(nums);
	}

	public static String toString(int[] nums) {
	//�ַ���������������������ַ���	
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < nums.length; i++) {
			if(i < nums.length-1){
				sb.append(nums[i]+" ");
			}
			else
			{
				sb.append(nums[i]);
			}
		}
		return sb.toString();
	}

	public static int[] parseIntArray(String[] strs) {
		// ����һ��int����
		int[] arr = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		return arr;
	}

}
