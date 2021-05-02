import java.util.Date;

public class Main {

	
	public static void main(String[] args) {
		
	BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
	Customer customer1 = new Customer(1,"Gökhan","Sönmez",new Date(1989,9,13),"12345678");
	
	customerManager.Save(customer1);

	}

}
