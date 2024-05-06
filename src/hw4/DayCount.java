package hw4;

import java.util.Scanner;

public class DayCount { // 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數 yyyy mm dd:");

		int yyyy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		
		//2月dd檢查-閏年29 非閏年28
		while (yyyy % 4 == 0 && mm == 2 && dd > 29 || yyyy % 4 != 0 && mm == 2 && dd > 28) {
			if (yyyy % 4 == 0) {
				System.out.println("請輸入合理的日(dd) (2月至多29天):");
				dd = sc.nextInt();
				if (mm != 2 || (mm == 2 && dd <= 29)) {
					break;
				}
			} else {
				System.out.println("請輸入合理的日(dd) (2月至多28天):");
				dd = sc.nextInt();
				if (mm != 2 || (mm == 2 && dd <= 28)) {
					break;
				}
			}
		}

		int[][] mdArr1 = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 非閏年

		int[][] mdArr2 = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 閏年

		int daySum = 0;
		int leftDay = 0;
		int countDay = 0;

		if (yyyy % 4 == 0) { // 判斷是否為閏年
			for (int i = 0; i <= mm - 1; i++) {
				daySum += mdArr2[1][i]; // 先把至當月底(yy)的累積天數加出來
			}
			leftDay = mdArr2[1][mm - 1] - dd; // 然後 當月還沒過的天數=當月月底-dd
			countDay = daySum - leftDay; // 第幾天=至當月底的累積天數-當月還沒過的天數
			
		} else {
			for (int i = 0; i <= mm - 1; i++) {
				daySum += mdArr1[1][i]; // 先把至當月底(yy)的累積天數加出來
			}
			leftDay = mdArr1[1][mm - 1] - dd; // 然後 當月還沒過的天數=當月月底-dd
			countDay = daySum - leftDay; // 第幾天=至當月底的累積天數-當月還沒過的天數
		}
		System.out.printf("輸入的日期為該年第%d天", countDay);
		sc.close();
	}
}
