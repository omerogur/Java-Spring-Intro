package homeworkweek3;

public class Main {
	
	public static void main(String [] args) {
		
		
		
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
		
	
				
		
		
		
		InstructorManager is = new InstructorManager();
		StudentManager stdmanager = new StudentManager();
		
		stdmanager.add(student);
		is.add(ins);
		stdmanager.delete(student);
		is.delete(ins);
		
	}

}
