package com.kbstar.dto;

public class ItemDTO {
	private int id;
	private String name;
	private double price;
	private int qt;
	
	//디포올트 컨스트럭터
	public ItemDTO() {
	}
	//all 컨스트럭터
	public ItemDTO(int id, String name, double price, int qt) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qt = qt;
	}
	//게터 세터 생성 시작
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQt() {
		return qt;
	}
	public void setQt(int qt) {
		this.qt = qt;
	}
	//게터 세터 생성 끝
	
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", qt=" + qt + "]";
	}
	
}
