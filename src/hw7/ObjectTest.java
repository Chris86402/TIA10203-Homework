package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectTest {

	public static void main(String[] args) throws Exception {
		// 輸入
		File file = new File("Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				// readObject()回傳的是Object類型,沒有speak()方法.故要(Animal)強制轉型為Animal類型,才能使用Animal類型的speak方法
				// 括號意思是 整個轉為Animal型別 再去呼叫show()方法
				System.out.println("--------------------");
			}
		} catch (EOFException e) { // End Of File Exception 利用錯誤結束while迴圈
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}

}
