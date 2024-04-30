package hw3;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		System.out.println("請輸入數字:");

		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 10); // 1.要自動產生一個0~100的亂數
		int guess = sc.nextInt(); // 2.要可以讓使用者輸入數字

		while (guess != answer) { // 3.比對 系統 vs 使用者 正確就跳出迴圈結束遊戲 錯誤就繼續猜
			if (guess < answer) { // 4.每次猜錯 就提示 使用者vs系統 是大於還是小於
				System.out.println("猜錯囉! 小於正確答案。" + "\n" + "請輸入數字:");
			} else if (guess > answer) {
				System.out.println("猜錯囉! 大於正確答案。" + "\n" + "請輸入數字:");
			}
			guess = sc.nextInt();
		}
		if (answer == guess) {
			System.out.println("答對了! 答案就是" + answer);
		}

	}
}
