package hw4;

import java.util.Arrays;

public class ExamTheBest { // 班上有8位同學，他們進行了6次考試，請算出每位同學考最高分的次數
	public static void main(String[] args) { 

		int[][] grade = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0 }; // 最高分計次

		for (int i = 0; i < grade.length; i++) {
			int[] gradeB = Arrays.copyOf(grade[i], grade[i].length); // 為確保原陣列的index不亂掉 先copyOf複製出一個陣列B
			Arrays.sort(gradeB); // sort從小排到大

			for (int j = 0; j < grade[i].length; j++) { // 比較每次小考內容
				if (grade[i][j] == gradeB[gradeB.length - 1]) { // 找出原陣列當次小考最高者.陣列B最後一個元素的index的值就是最大的值
					count[j] += 1; //最高分者計次+1
				}
			}
		}
		for (int i = 0; i <= count.length - 1; i++) { // 顯示每位同學考最高分的次數
			System.out.printf("%d號 %d次最高分%n", i + 1, count[i]); // index+1就是座號
		}
	}
}
