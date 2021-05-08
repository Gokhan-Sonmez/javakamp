package registerLoginDemo.dataAccess.abstracts;

import java.util.List;

import registerLoginDemo.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	
	void login (String email,String password);
	User get(int id);
	
	List<User>getAll();
	List<User>getByMail(String email);

}
