package api.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Customer {

	private String name;
	private String email;
	private Double money;
	private List<Product> itemsToBuy;
	
	public Customer() {
		super();
	}
	
	public Customer(String name, String email, Double money, List<Product> itemsToBuy) {
		super();
		this.name = name;
		this.email = email;
		this.money = money;
		this.itemsToBuy = itemsToBuy;
	}
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@XmlAttribute
	public Double getMoney() {
		return money;
	}
	
	public void setMoney(Double money) {
		this.money = money;
	}
	
	@XmlElement(name = "product")
	public List<Product> getItemsToBuy() {
		return itemsToBuy;
	}
	
	public void setItemsToBuy(List<Product> itemsToBuy) {
		this.itemsToBuy = itemsToBuy;
	}
	
}
