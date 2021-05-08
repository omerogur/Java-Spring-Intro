package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateProductDao implements UserDao{
     List<User> list1 = new ArrayList<User>();
     
	@Override
	public void add(User user) {
		list1.add(user);
       System.out.println(user.getFirstName() +" "+user.getLastName() +" : database eklendi");		
	}

	@Override
	public void update(User user) {
		 System.out.println(user.getFirstName() +" "+user.getLastName() +"database güncellendi");	
		
	}

	@Override
	public void delete(User user) {
		 System.out.println(user.getFirstName() +" "+user.getLastName() +"database silindi");
	}

	@Override
	public List<User> getAll() {
	    
		return list1;
	}

	@Override
	public User get(int userId) {
		return list1.get(userId);
	}

}
