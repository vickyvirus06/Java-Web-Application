package com.Bean;

public class Book {

	private String id;
	private String name;
	private String amount;
	private String discount;
	private String total_pay;
	
	
	
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getTotal_pay() {
		return total_pay;
	}
	public void setTotal_pay(String total_pay) {
		this.total_pay = total_pay;
	}
	public Book()
	{
		
	}
	public Book(String name, String amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
