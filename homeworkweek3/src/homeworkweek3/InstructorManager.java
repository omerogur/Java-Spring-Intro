package homeworkweek3;

public class InstructorManager extends UserManager {
	
	public void add(Instructor �ns) {

		System.out.println(�ns.getFirstName() + " isimli e�itmen olu�turuldu");

	}

	public void delete(Instructor �ns) {

		System.out.println(�ns.getFirstName() + " isimli e�itmen silindi");
	}

}
