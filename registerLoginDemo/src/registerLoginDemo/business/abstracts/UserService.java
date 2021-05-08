package registerLoginDemo.business.abstracts;

import java.util.List;

import registerLoginDemo.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	User get(int id);

}
