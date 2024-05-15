package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DogCatObject {

	public static void main(String[] args) throws Exception {
		File file = new File("Object.ser"); // .ser特定程式存取用的檔案格式
		Animal[] a = new Animal[4];
		a[0] = new Dog("小白");
		a[1] = new Dog("小黑");
		a[2] = new Cat("咪咪");
		a[3] = new Cat("喵喵");

		// 輸出
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(a[0]);
		oos.writeObject(a[1]);
		oos.writeObject(a[2]);
		oos.writeObject(a[3]);
		oos.close();
		fos.close();
		
	}
}
