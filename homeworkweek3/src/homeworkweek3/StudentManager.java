package homeworkweek3;

public class StudentManager extends UserManager {

	
	public void add(Student std) {

		System.out.println(std.getFirstName() + " isimli �yelik olu�turuldu");

	}

	public void delete(Student std) {

		System.out.println(std.getFirstName() + " isimli �yelik silindi");
	}

}
