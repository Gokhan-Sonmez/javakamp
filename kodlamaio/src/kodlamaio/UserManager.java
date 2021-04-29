package kodlamaio;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Eklendi " + user.firstname + user.lastname  );
	}
	public void delete(User user) {
		System.out.println(" Silindi " + user.firstname + user.lastname );
	}
	
	public void List( ) {
		
		System.out.println("Listelendi");
	}
	
	

}
