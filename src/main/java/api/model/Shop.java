package api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

public class Shop {

	private String name;
	private List<Product> products;
	private List<Customer> customers;
	
	public Shop() {
		super();
	}

	public Shop(String name, List<Product> products, List<Customer> customers) {
		super();
		this.name = name;
		this.products = products;
		this.customers = customers;
	}

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElementWrapper(name="products")
    @XmlElement(name="product")
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@XmlElementWrapper(name="customers")
    @XmlElement(name="customer")
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}
