package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTest { //設計一個方法, 呼叫方法時第一個參數代表的檔案會複製到第二個參數代表的檔案

	public void copyFile(String fileName1, String fileName2) throws IOException {

		File f1 = new File(fileName1); //來源檔案(被複製)
		File f2 = new File(fileName2); //目的地檔案

		FileReader r1 = new FileReader(f1); //建立字元資料流物件
		FileWriter r2 = new FileWriter(f2);
		int c;

		while ((c = r1.read()) != -1) { //讀取來源檔案每一個字元
			r2.write(c); //寫出字元到目的地檔案
			System.out.flush(); //沖水 強制輸出緩衝區未滿的資料
		}
		r1.close(); //關閉資料串流
		r2.close();
	}

	public static void main(String[] args) {
		CopyFileTest x = new CopyFileTest(); //建立CopyFileTest物件
		try {
			x.copyFile("f1.txt", "f2.txt"); //呼叫copyFile方法
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
