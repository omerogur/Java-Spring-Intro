
public class GameManager implements IGameManager{

	@Override
	public void sell(Player player, Campaign campaign, Game game) {
		System.out.println("OYUNCU: "+player.getFirstName()+ " - " +player.getLastName()+ " KAMPANYA : " +campaign.getCampaignName()+ "�ND�R�ML� F�YAT :"+campaign.getLastPrice()  );
			
	}

	@Override
	public void addGame(Game game) {
		System.out.println("OYUN EKLEND� :" +game.getGameName());			
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("OYUN G�NCELLEND� :" +game.getGameName());			
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("OYUN S�L�ND� :" +game.getGameName());			
	}

}
