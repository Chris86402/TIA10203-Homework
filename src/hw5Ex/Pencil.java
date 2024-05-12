package hw5Ex;

public class Pencil extends Pen {

	public Pencil(String brand, double price) { //建構子
		super(brand, price);
	}
	
	public void write() { //定義抽象方法內容
		System.out.println("削鉛筆再寫");
	}

	public double getPrice() { //售價為定價8折
		return super.getPrice() * 0.8;
	}

}
