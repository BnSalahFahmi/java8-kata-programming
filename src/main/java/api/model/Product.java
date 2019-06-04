package api.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
		super();
	}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
