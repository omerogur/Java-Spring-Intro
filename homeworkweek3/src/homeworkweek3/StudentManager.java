package homeworkweek3;

public class StudentManager extends UserManager {

	
	public void add(Student std) {

		System.out.println(std.getFirstName() + " isimli ��renci olu�turuldu");

	}

	public void delete(Student std) {

		System.out.println(std.getFirstName() + " isimli ��renci silindi");
	}

}
