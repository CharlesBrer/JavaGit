package StringStu;

public class HomeWork {

	/**��ȡ�����ַ����������ͬ�Ӵ�
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *  ˼·�� 1.��ȷ�����ַ����ĳ��̣��ڳ������ж϶̴��Ƿ���� 2.���ڣ����ҵ���˵���̴�����������ͬ�Ӵ�
		 * 3.�����ڵĻ����ͽ��̴������ȵݼ��ķ�ʽ����ȡ�̴����Ӵ�������֮���ж� 4.һ���ҵ����ͽ�������
		 */
		String s1 = "sadouaobafbaixingyubusadas";
		String s2 = "asfkbeucbaixingyudeq";
		String maxSubString = getMaxSubString(s1, s2);
		System.out.println("maxSubString:" + maxSubString);

	}

	public static String getMaxSubString(String s1, String s2) {
		// ��ȷ�����Ͷ̴�
		String max, min;
		max = (s1.length() > s2.length()) ? s1 : s2;
		min = max.equals(s2) ? s1 : s2;
		// ���ճ������εݼ��ķ�ʽ��ȡ�Ӵ�
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
