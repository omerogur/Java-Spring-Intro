package business.abstracts;

import dataAccess.concretes.HibernateProductDao;
import entities.concretes.User;

public interface AuthService {
	
	void login(String email,String password,HibernateProductDao db);
	void register(User user ,HibernateProductDao db);
	boolean emailvalidate(User user,HibernateProductDao db);
	boolean passwordvalidate(User user);
	boolean usernamevalidate(User user);
    void mailactivate(User user);

}
