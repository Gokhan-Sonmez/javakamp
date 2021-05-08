package registerLoginDemo.dataAccess.concretes;

import java.util.List;

import registerLoginDemo.dataAccess.abstracts.UserDao;
import registerLoginDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullan�c� eklendi ");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi  " );
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi  " );
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(String email, String password) {
		
		System.out.println("Giri� yap�ld�");
		
	}

	@Override
	public List<User> getByMail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
