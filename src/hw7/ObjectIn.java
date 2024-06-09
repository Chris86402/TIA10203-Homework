package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectIn { //5.讀取Object.ser的四個物件，並執行speak()方法
	public static void main(String[] args) throws Exception {
		//讀取來源檔案
		File objFile = new File("c:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(objFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(objFile.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		//輸入(讀進)
		try {
			while (true) {
				//readObject()回傳的是Object類型,沒有speak()方法
				//故要(Animal)強制轉型為Animal類型,才能使用Animal類型的speak()方法
				((Animal) ois.readObject()).speak();
			}
		} catch(EOFException e) {
			System.out.println("資料讀取完畢!");
		}
		//關閉資料流
		ois.close();
		fis.close();
	}
}