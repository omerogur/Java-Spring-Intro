package homeworkweek3;

public class Main {
	
	public static void main(String [] args) {
		
		User user = new User();
		user.age=18;
		user.email="mail";
		user.firstName="�mer";
		user.lastName="o�ur";
		user.id=1;
		user.password="�rneksifre";
		user.username="kullan�c�adi";
		
		Instructor ins = new Instructor();
		ins.firstName="engin";
		ins.lastName="demiro�";
		ins.email="mail2";
		ins.id=2;
		ins.experience="10 y�l";
		ins.age=27;
		ins.password="e�itmenpassword";
		ins.username="Engin234";
		
		Student student = new Student();
		student.age=15;
		student.department="DEPARTMANT STUDENT";
		student.email="student mail";
		student.firstName="student name";
		student.lastName="student lastname";
		student.id=3;
		student.school="beykent";
		
	
				
		
		
		UserManager usermanager = new UserManager();
		InstructorManager is = new InstructorManager();
		StudentManager stdmanager = new StudentManager();
		usermanager.add(user);
		stdmanager.add(student);
		is.add(ins);
		usermanager.delete(user);
		stdmanager.delete(student);
		is.delete(ins);
		
	}

}
