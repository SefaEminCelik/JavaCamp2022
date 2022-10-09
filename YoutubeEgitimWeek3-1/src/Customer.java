
public class Customer {

	public Customer() {
		System.out.println("müşteri nesnesi başlatıldı");
	}
	
	
	private int id;
	
	private String nationalIdentity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
}
