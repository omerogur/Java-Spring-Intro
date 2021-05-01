package homeworkweek3;

public class InstructorManager extends UserManager {
	
	public void add(Instructor ýns) {

		System.out.println(ýns.getFirstName() + " isimli eðitmen oluþturuldu");

	}

	public void delete(Instructor ýns) {

		System.out.println(ýns.getFirstName() + " isimli eðitmen silindi");
	}

}
