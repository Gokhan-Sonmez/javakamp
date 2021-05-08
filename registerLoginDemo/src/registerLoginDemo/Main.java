package registerLoginDemo;


import registerLoginDemo.business.concretes.AuthManager;
import registerLoginDemo.business.concretes.EmailManager;
import registerLoginDemo.core.AuthService;
import registerLoginDemo.core.GoogleAuthManagerAdapter;
import registerLoginDemo.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		AuthService authService1 = new AuthManager(new HibernateUserDao(),new EmailManager());
		authService1.register(1, "Gökhan", "Sönmez", "gokhan@gmail.com", "123456");
	
		AuthService authService2 = new GoogleAuthManagerAdapter();
		authService2.register(2, "Gökhan", "Sönmez", "gokhan@gmail.com", "123456");
		authService2.login("gokhan@gmail.com", "123456");
	
	}		
}
