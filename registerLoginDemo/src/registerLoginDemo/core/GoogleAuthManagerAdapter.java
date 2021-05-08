package registerLoginDemo.core;


import registerLoginDemo.gAuth.GAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	private EmailService emailService;
	
	public GoogleAuthManagerAdapter(EmailService emailService) {
		
		this.emailService = emailService;
	}

	@Override
	public void register(int id,String firstName,String lastName, String email,String password) {
		
		GAuthManager manager = new GAuthManager();
		
		manager.gRegister(id,email,password,firstName,lastName);
		this.emailService.send(email);
		
	}

	@Override
	public void login(String email, String password) {
		
		GAuthManager manager = new GAuthManager();
		manager.gLogin(email, password);
	}

}
