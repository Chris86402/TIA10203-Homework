package hw5;

import java.util.Arrays;

//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳
public class MaxElement {

	public int maxElement(int x[][]) {
		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]); // intArray[0] 跟 intArray[1] 都先由小排到大
		}

		int a = x[0][x[0].length - 1]; // x[0]的最後一個元素為最大值,x[0]的長度為3,長度-1即最末元素x[0][2]
		int b = x[1][x[1].length - 1];

		if (a > b) { // x[0]與x[1]最末元素比大小,回傳大者
			return a;
		} else {
			return b;
		}
	}

	public double maxElement(double x[][]) { // 同int方法內容, 僅類型改double
		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
		}

		double a = x[0][x[0].length - 1];
		double b = x[1][x[1].length - 1];

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		MaxElement m1 = new MaxElement(); // 建立MaxElement類別的物件實體m1
		System.out.println(m1.maxElement(intArray)); // 呼叫m1的方法,傳入int陣列,並列印回傳值
		System.out.println(m1.maxElement(doubleArray));// 呼叫m1的方法,傳入double陣列,並列印回傳值
	}
}
