package business.concretes;

import java.util.List;

import business.abstracts.ConfirmationService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private ConfirmationService confirmationService;	

	public UserManager(UserDao userDao, ConfirmationService confirmationService) {
		this.userDao = userDao;
		this.confirmationService = confirmationService;
	}
	
	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public User get(int userId) {
		return this.userDao.get(userId);
	}

	@Override
	public void add(User user) {
		this.confirmationService.message(user.getEmail(), "ONAY KODU 123");
		this.userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

}
