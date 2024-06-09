package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SampleFile { // 請寫一個程式讀取這個Sample.txt檔案，並輸出位元組,字元數,資料列數

	public static void main(String[] args) {
		
		try {
			File file = new File("c:\\TIA102_Workspace\\TIA10203-Homework\\files\\Sample.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			int charNum = 0, lineNum = 0;
			String str;

			// 使用BufferedReader的readLine()可一次讀整行文字
			// not including any line-termination characters like "\n"
			while ((str = br.readLine()) != null) {
				charNum += str.length() + 1; // length()方法取得該列字數+每行最後的換行符號
				lineNum++; // 累計列數
			}
			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料", file.length(), charNum, lineNum);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
