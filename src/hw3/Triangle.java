package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle { //請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] arr = { a, b, c };
		Arrays.sort(arr);

		if (a > 0 && b > 0 && c > 0) {
			if (a + b > c && b + c > a && a + c > b) {
				if (Math.abs(a - b) < c && Math.abs(c - b) < a && Math.abs(a - c) < b) {
					System.out.println("是三角形");

					if (a == b && b == c & c == a) { // 正三角形: 三邊邊長相等
						System.out.print("正三角形");
					} else if (a == b || b == c || c == a) { // 等腰三角形: 任兩邊邊長相等
						System.out.print("等腰三角形");
					} else if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) { // 畢氏定理塞高
						System.out.print("直角三角形");
					} else {
						System.out.print("其他三角形");
					}
				} else {
					System.out.print("不是三角形");
				}
			} else {
				System.out.print("不是三角形");
			}
		} else {
			System.out.print("不是三角形");
		}
		sc.close();
	}
}
