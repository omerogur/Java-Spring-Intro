package homeworkweek3;

public class UserManager {	
	
	 public void add(User user) {
		  
		 System.out.println(user.getFirstName() + " isimli üyelik oluþturuldu");
		 	
	 }
    public void delete(User user) {
    	
    	System.out.println(user.getFirstName() + " isimli üyelik silindi");
    }
    

}
