package hw7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTest { //設計一個方法, 呼叫方法時第一個參數代表的檔案會複製到第二個參數代表的檔案

	//copyFile方法
	public void copyFile(String filePath1, String filePath2) throws IOException {
		FileReader fs = new FileReader(filePath1); //讀進來源(檔案1)
		FileWriter fw = new FileWriter(filePath2, true); //寫出到目的地(檔案2)

		int i;
		while ((i = fs.read()) != -1) { //每次讀出一個字元的Unicode碼
			fw.write(i); //寫出至目的地檔案
		}
		
		//關閉資源
		fs.close();
		fw.close();
	}

	//執行copyFile方法
	public static void main(String[] args) {
		String filePath1 = "c:\\TIA102_Workspace\\TIA10203-Homework\\files\\file01.txt";
		String filePath2 = "c:\\TIA102_Workspace\\TIA10203-Homework\\files\\file02.txt";

		CopyFileTest c1 = new CopyFileTest(); //建立此類別的物件
		
		try {
			c1.copyFile(filePath1, filePath2); //呼叫copyFile()方法
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
