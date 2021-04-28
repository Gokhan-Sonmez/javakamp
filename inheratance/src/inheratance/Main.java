package inheratance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber ="12345";
		
	    SendikaCustomer abc = new SendikaCustomer();
	    abc.customerNumber ="9999";
		
		CorporateCustomer hepsiburada = new  CorporateCustomer();
		hepsiburada.customerNumber = "67891";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {engin,abc,hepsiburada};
		
		
		customerManager.addMultiple(customers);
		
	}

}
