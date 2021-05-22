package homeworkweek3;

public class Instructor extends User {


	String experience;

	public Instructor(int id, String firstName, String lastName, String email, String username, String password,
			int age, String experience) {
		super(id, firstName, lastName, email, username, password, age);
		this.experience = experience;
		
	}

	public Instructor() {
	
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}




}
