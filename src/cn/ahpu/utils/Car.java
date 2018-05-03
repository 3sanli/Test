package cn.ahpu.utils;

import java.util.ArrayList;
import java.util.List;

import cn.ahpu.domain.Product;

public class Car {
	//商品集
	private List<Product> list;
	//总价
	private float count;	
	
	public Car() {
		this.list = new ArrayList<Product>();
		list.add(new Product(1,"苹果",2.8f));
		list.add(new Product(2,"香蕉",3.1f));
		list.add(new Product(3,"梨",2.5f));
		list.add(new Product(4,"橘子",2.3f));
		this.count = 0;
	}
		
	

	//添加商品
	public void addItem(Integer id) {
		for(Product p:this.list) {
			if(p.getId() == id) {
				p.setNumber(p.getNumber()+1);								
				this.count += p.getPrice();
			}
		}
	}
	//移除商品
	public void removeItem(Integer id) {
		for(Product p:this.list) {
			if(p.getId() == id) {
				p.setNumber(p.getNumber()-1);
				this.count -= p.getPrice();
			}
		}
	}
	//清空购物车
	public void clear() {
		for(Product p:this.list) {
			p.setNumber(0);
		}
		this.count = 0;
	}


	public List<Product> getList() {		
		return list;
	}


	public void setList(List<Product> list) {
		this.list = list;
	}


	public String getCount() {
		return String.format("%.1f", this.count);
	}

}
