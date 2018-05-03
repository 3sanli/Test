package cn.ahpu.domain;

public class Product {
	private Integer id;
	private String name;
	private float price;
	private int number;
	
	public Product(Integer id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = 0;
	}
	public Product() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTotalPrice() {
		return String.format("%.1f", this.price*this.number);
	}

	
}
