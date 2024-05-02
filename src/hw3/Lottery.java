package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		System.out.println("阿文...請問你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[49]; // 樂透數字
		for (int i = 1; i <= arr.length; i++) { // 填入數字1~49
			arr[i - 1] = i;
		}

		if (n < 5) { // 使用者輸入1~4處理方法
			for (int i = 0; i <= 9; i++) {
				arr[((n * 10) + i) - 1] = 0; // ex.n=2 即20~29 值-1為index
			}
		}

		arr[n - 1] = 0;
		arr[(n + 10) - 1] = 0;
		arr[(n + 20) - 1] = 0;
		arr[(n + 30) - 1] = 0;
		arr[(n + 40) - 1] = 0;

		int numCount = 0; // 計數用
		int count = 1; // 換行用
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > 0) {
				numCount++;

				System.out.print(arr[i] + "\t");
				count++;

				if (count % 7 == 0) {
					System.out.println();
					count++;
				}
			}
		}
		System.out.printf("總共有%d數字可選%n%n", numCount);

		int[] myLuckyNumber = new int[6]; // 進階part
		for (int i = 0; i <= myLuckyNumber.length - 1; i++) {
			int j = (int) (Math.random() * 49); // 把random出來的數當作index 0~48

			while (arr[j] == 0) { // 為0的話就重新跑亂數挑
				j = (int) (Math.random() * 49);
			}

			if (arr[j] != 0) {
				myLuckyNumber[i] = arr[j]; // 不為0就放進新陣列
				arr[j] = 0; // 抽過的元素內容改0 避免重複抽中
			}
		}
		System.out.print("阿文發大財的6個號碼: ");
		Arrays.sort(myLuckyNumber); // 排序
		for (int i = 0; i <= myLuckyNumber.length - 1; i++) {
			System.out.print(myLuckyNumber[i] + " ");
		}
		sc.close();
	}
}
