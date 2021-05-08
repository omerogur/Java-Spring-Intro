
import java.util.ArrayList;
import java.util.List;

import business.abstracts.AuthService;
import business.concretes.AuthManager;
import business.concretes.ConfirmationManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
        User user1 = new User(0,"ömer","oður","kaanugur725","sifre123");
        User user2 = new User(1,"ömer1","oður1","kaanugur72@hotmail.com","omer123456");
        User user3 = new User(2,"ömer2","oður2","kaanugur722","omer1234556676");
        User user4 = new User(3,"ömer3","oður3","kaanugur723","omer1234556676");
        User user5 = new User(4,"ömer4","oður4","kaanugur725@gmail.com","12356789");
        
        HibernateProductDao h1 = new HibernateProductDao();
        ConfirmationManager c1 = new ConfirmationManager();
        
        
        AuthService a1 = new AuthManager(new UserManager(h1,c1));
       a1.register(user2, h1);
       //a1.register(user5, h1);
       a1.mailactivate(user5);
       a1.login("kaanugur72@hotmail.com", "omer123456", h1);
	}

}
