package registerLoginDemo.business.concretes;

import java.util.List;

import registerLoginDemo.business.abstracts.UserService;
import registerLoginDemo.dataAccess.abstracts.UserDao;
import registerLoginDemo.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
	
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		this.userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		
		this.userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
