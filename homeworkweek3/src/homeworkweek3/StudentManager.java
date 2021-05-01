package homeworkweek3;

public class StudentManager extends UserManager {

	
	public void add(Student std) {

		System.out.println(std.getFirstName() + " isimli öðrenci oluþturuldu");

	}

	public void delete(Student std) {

		System.out.println(std.getFirstName() + " isimli öðrenci silindi");
	}

}
