
public class CustomerManager {
	
	
	private Customer customer;
	private ICreditManager creditManager;
	
	
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void add() {
		
		System.out.println("customer isimli Customer nesnesi eklendi.");
	}

	public void delete() {
		
		System.out.println("customer isimli Customer nesnesi silindi." );
	}
	
	
	public void giveCredit() {
		
		this.creditManager.calculate();
		System.out.println("Kredi Hesaplandı");
	}
}


