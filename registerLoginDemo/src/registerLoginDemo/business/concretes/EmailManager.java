package registerLoginDemo.business.concretes;

import registerLoginDemo.core.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send(String email){
		System.out.println("Aktivasyon maili gönderildi");
		System.out.println("Aktif etmek için týklayýnýz");
	}

}
