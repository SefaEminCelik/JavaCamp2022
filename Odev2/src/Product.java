public class Product {
		
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı.");
		this.id = id ;
		this.description = description;
		this.name = name;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk= renk;
	}
	
	public Product () {
		
	}
	
	// attirubete | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//GETTER SETTER
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	int getStockAmount() {
		return stockAmount;
	}
	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	String getRenk() {
		return renk;
	}
	void setRenk(String renk) {
		this.renk = renk;
	}
	String getKod() {
		return this.name.substring(0,1)+ id;
	}



}
