
public class Main {

	public static void main(String[] args) {
//		int[] sayilar1 = new int [] {1,2,3};
//		int[] sayilar2 = new int [] {10,20,30};
//		sayilar1= sayilar2;
//		
//		
//		sayilar2[0] = 1000;
//		System.out.println(sayilar2[0]);
//		

//		CreditManager creditManager =  new CreditManager();
//		creditManager.calculate();
//		creditManager.save();
//			
//		
//		Company company = new Company();
//		company.setId(1);
//		company.setNationalIdentity("123456");
//		company.setTaxNumber("654321");
//		company.setCompanyName("Arçelik");
//		
//		
//		Person person =  new Person();
//		person.setId(2);
//		person.setFirstName("sefa");
//		person.setLastName("Çelik");
//		person.setNationalIdentity("12");
//		
//		
//	
//
//		CustomerManager customerManager= new CustomerManager(company);
//		customerManager.add();
//		customerManager.delete();
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		

		
		
	}
}
