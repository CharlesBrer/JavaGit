package BasicClassTypeStu;

import java.util.Arrays;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * “23 9 -4 18 100 7” 从小到大形成有序字符串 思路 1.排序，要数组，数组就要有元素
		 * 2.元素在字符串中，要获取字符串的内容，需要String对象 3.从字符串获取到数值后存储在一个int数组中进行排序
		 * 4.排好序后变成字符串
		 */
		String numberString = "23 9 -4 18 100 7";
		numberString = sortNumberString(numberString);
		System.out.println("numbers=" + numberString);
	}

	public static String sortNumberString(String numberString) {
		// 获取字符串中的数字，通过空格进行indexOf的索引，随后使用substring截取
		// 这个方法好麻烦，这些数值之间的分割符都是空格，通过空格对字符串分离，则分离出来的都是数字内容的字符串。
		// 一个字符串通过分割变成了多个字符串
		String[] strs = numberString.split(" ");
		// 不能直接对字符串进行大小排序，因为会出现错误，必须转成整数
		// 将字符串数组转换成int数组
		int[] nums = parseIntArray(strs);
		// 对数组排序
		Arrays.sort(nums);
		// 将数组转成字符串
		return toString(nums);
	}

	public static String toString(int[] nums) {
	//字符串缓冲区来将数组存入字符串	
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
		// 定义一个int数组
		int[] arr = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		return arr;
	}

}
