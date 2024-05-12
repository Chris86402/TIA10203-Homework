package hw5Ex;

public abstract class Pen { //有抽象方法就要宣告為抽象類別
	private String brand;
	private double price;
	
	public Pen() { //無參數的建構子
		super();
	}
	
	public Pen(String brand, double price) { //設定屬性的建構子
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	//宣告抽象方法
	public abstract void write();
	
}
