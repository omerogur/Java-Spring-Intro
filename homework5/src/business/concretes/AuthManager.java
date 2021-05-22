package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.User;

public class AuthManager implements AuthService {
	private UserService userService;

	public AuthManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void login(String email, String password, HibernateProductDao db) {
		for (User users : db.getAll()) {
			if (users.getEmail() == email && users.getPassword() == password) {
				if (users.onay == false) {
					System.out.println("Hesab�n�z onaylanmam�� l�tfen onaylay�n�z");
				} else {
					System.out.println("Ho� geldin : " + users.getFirstName());
				}

			} else {
				System.out.println("girilen bilgier hatal� l�tfen kontrol ediniz");
			}
		}
	}

	@Override
	public void register(User user, HibernateProductDao db) {

		if (emailvalidate(user, db) && passwordvalidate(user) && usernamevalidate(user)) {
			userService.add(user);
			System.out.println("KAYIT BA�ARILI");

		}

	}

	@Override
	public boolean emailvalidate(User user, HibernateProductDao db) {
		for (User users : db.getAll()) {
			if (users.getEmail() == user.getEmail()) {
				System.out.println("BU  EPOSTA KULLANILIYOR");
				return false;
			}
		}
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches() == true) {
			return true;
		} else {
			System.out.println("mail tan�ms�z ge�erli mail giriniz");
			return false;
		}

	}

	@Override
	public boolean passwordvalidate(User user) {
		if (user.getPassword().length() < 8) {
			System.out.println("�ifre 8 karakterden k���k olamaz");
			return false;
		}
		return true;
	}

	@Override
	public boolean usernamevalidate(User user) {
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("isim 8 karakterden k���k olamaz");
			return false;
		}
		return true;
	}

	@Override
	public void mailactivate(User user) {
		 user.onay=true;
		 System.out.println("hesap onayland�");
		
	}
}
