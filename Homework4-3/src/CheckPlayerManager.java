
public class CheckPlayerManager implements ICheckPlayer{

	@Override
	public boolean checkPlayer(Player player) {
		  if(player.getNationalityId().length()==11 && player.getFirstName().length()>=2 && player.getLastName().length()>=2 && player.getBirthOfYear()>=1930) {
		  System.out.println("BÝLGÝLER DOÐRULANDI");
		return true;
	
	}
	else 
	 return false;
		  
	}
}
