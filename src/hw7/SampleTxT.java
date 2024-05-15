package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SampleTxT { //請寫一個程式讀取這個Sample.txt檔案，並輸出位元組,字元數,資料列數

	public static void main(String[] args) {
		int i;
		int lines = 0;
		int count = 0;
		String path = "C:\\TIA102_Workspace\\TIA10203-Homework\\files\\Sample.txt";

		try {
			File f1 = new File(path);

			FileReader fr1 = new FileReader(path);
			FileReader fr2 = new FileReader(path);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);

			while ((i = br1.read()) != -1) {
				count++;
			}

			String str;
			while ((str = br2.readLine()) != null) {
				lines++;
			}
			br1.close();
			fr1.close();
			br2.close();
			fr2.close();
			
			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料",f1.length(),count,lines);

		} catch (IOException e) {}
	}
}
