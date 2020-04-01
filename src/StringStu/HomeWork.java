package StringStu;

public class HomeWork {

	/**获取两个字符串的最大相同子串
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *  思路： 1.明确两个字符串的长短，在长串中判断短串是否存在 2.存在，已找到，说明短串就是最大的相同子串
		 * 3.不存在的话，就将短串按长度递减的方式，获取短串的子串到长串之中判断 4.一旦找到，就结束查找
		 */
		String s1 = "sadouaobafbaixingyubusadas";
		String s2 = "asfkbeucbaixingyudeq";
		String maxSubString = getMaxSubString(s1, s2);
		System.out.println("maxSubString:" + maxSubString);

	}

	public static String getMaxSubString(String s1, String s2) {
		// 明确长串和短串
		String max, min;
		max = (s1.length() > s2.length()) ? s1 : s2;
		min = max.equals(s2) ? s1 : s2;
		// 按照长度依次递减的方式获取子串
		for (int i = 0; i < min.length(); i++) {
			for (int start = 0, end = min.length() - i; end <= min.length(); start++, end++) {
				String t = min.substring(start, end);
				if (max.contains(t))
					return t;
			}
		}
		return null;
	}

}
