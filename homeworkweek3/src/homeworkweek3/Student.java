package homeworkweek3;

public class Student extends User {
       String school;
       String department;
       
       
	public Student(int id, String firstName, String lastName, String email, String username, String password, int age,
			String school, String department) {
		super(id, firstName, lastName, email, username, password, age);
		this.school = school;
		this.department = department;
	}


	public Student() {
		
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
       
       
}
