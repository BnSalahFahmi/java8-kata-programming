package api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mall")
public class Mall {

	private String name;
	private String address;
	private List<Shop> shops;
	
	public Mall() {
		super();
	}

	public Mall(String name, String address, List<Shop> shops) {
		super();
		this.name = name;
		this.address = address;
		this.shops = shops;
	}

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@XmlElementWrapper(name="shops")
    @XmlElement(name="shop")
	public List<Shop> getShops() {
		return shops;
	}

	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}
	
}
