package registerLoginDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import registerLoginDemo.core.AuthService;
import registerLoginDemo.core.EmailService;
import registerLoginDemo.dataAccess.abstracts.UserDao;
import registerLoginDemo.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserDao userDao;
	private EmailService emailService;
	public AuthManager(UserDao userDao,EmailService emailService) {

		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public void register(int id,String firstName,String lastName, String email,String password) {
		User user = new User(id, email,password,firstName,lastName);
		

	 if (!isvalidEmailFormat(email)) {
		 System.out.println("Yanlýþ mail formatý");
		 return;
	  }
	 else if ((user.getFirstName().length() < 3) || (user.getLastName().length() < 3)) {
			System.out.println("Ad ve soyad en az iki karakterden olusmalidir.");
			return;
		}
	 else if (!(password.length() >= 6)) {
			System.out.println("Parola en az 6 karakterden olusmalidir..");
			return;
		}
	 else if (isUsedEmail(email)) {
		 System.out.println("Bu email adresi kayýtlýdýr");
	 }
	 
		this.userDao.add(user);
		this.emailService.send(email);
	 
	}

	@Override
	public void login(String email, String password) {
		 var userToCheck = this.userDao.getByMail(email);
         if (userToCheck == null)
         {
            System.out.println("Kullanýcý bulunamadý");
            return;
         }
		
		
		this.userDao.login(email, password);
		
	}
	
	private boolean isvalidEmailFormat(String email)
	{
		Pattern p = Pattern.compile("^(.+)@(.+)$");
        Matcher m = p.matcher(email);
        if (!m.matches()) {
            return false;
        }
        return true;
	}
	
	private boolean isUsedEmail(String email) {
        if (userDao.getByMail(email) != null) {
            System.out.println("Email is used before!");
            return true;
        }
        return false;
	}

}
