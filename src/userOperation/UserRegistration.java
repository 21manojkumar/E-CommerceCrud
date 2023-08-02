package userOperation;

public class UserRegistration {

	//Products contain id, description, name, price and quantity new .
	
	private int id;
	private String description;
	private String name;
	private int price;
	private int quantity;
	public int getId() {	
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", description=" + description + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	public UserRegistration(int id, String description, String name, int price, int quantity) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
}
