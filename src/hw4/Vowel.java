package hw4;

public class Vowel {
	public static void main(String[] args) { // 請用程式計算出這陣列裡面共有多少個母音
		char[] vArr = { 'a', 'e', 'i', 'o', 'u' };
		String[] strArr = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;
		for (int i = 0; i <= vArr.length - 1; i++) { // 遍歷母音們
			for (int j = 0; j <= strArr.length - 1; j++) { // 遍歷八大行星
				char[] charArr = strArr[j].toCharArray(); // 一個行星轉char陣列
				for (int k = 0; k <= charArr.length - 1; k++) {
					if (charArr[k] == vArr[i]) { // 比對每個字元
						count++; // 相等者+1
					}
				}
			}
		}
		System.out.printf("共有%d個母音",count);
	}
}
