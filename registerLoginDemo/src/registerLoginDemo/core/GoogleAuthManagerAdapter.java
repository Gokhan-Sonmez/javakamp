package registerLoginDemo.core;


import registerLoginDemo.gAuth.GAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	
	@Override
	public void register(int id,String firstName,String lastName, String email,String password) {
		
		GAuthManager manager = new GAuthManager();
		
		manager.gRegister(id,email,password,firstName,lastName);
		
		
	}

	@Override
	public void login(String email, String password) {
		
		GAuthManager manager = new GAuthManager();
		manager.gLogin(email, password);
	}

}
