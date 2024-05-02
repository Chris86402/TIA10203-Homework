package hw4;

import java.util.Scanner;

public class PoorHua {
	public static void main(String[] args) { // 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他
		int[][] myGoodColleague = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		System.out.println("小華...請問你想欠多少錢？");
		Scanner sc = new Scanner(System.in);
		int giveMeMoney = sc.nextInt();

		System.out.print("有錢可借的員工編號: ");
		int manIcanRob = 0;
		for (int i = 0; i <= myGoodColleague[1].length - 1; i++) { // 大家錢包裡的錢
			if (myGoodColleague[1][i] >= giveMeMoney) { // [1][0] [1][1] [1][2] [1][3]
				manIcanRob++;
				System.out.print(myGoodColleague[0][i] + " "); // [0][0] [0][1] [0][2] [0][3]
			}
		}
		System.out.printf(" 共 %d 人!", manIcanRob);
		sc.close();
	}
}
