package hw5;

import java.util.Scanner;

public class StarSquare { //設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形

	public void starSquare(int width, int height) { //定義StarSquare類別中的starSquare方法
		int i = height;
		int j = width;
		for (i = 1; i <= height; i++) { // 外圈-垂直
			for (j = 1; j <= width; j++) { // 內圈-水平
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) { //程式進入點
		System.out.println("請輸入寬與高:");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt(); //寬
		int height = sc.nextInt(); //高

		StarSquare st = new StarSquare(); //建立StarSquare類別的物件實體st
		st.starSquare(width, height); //呼叫物件st的starSquare方法
		sc.close(); //關閉Scanner
	}
}
