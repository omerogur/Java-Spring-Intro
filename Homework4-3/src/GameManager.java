
public class GameManager implements IGameManager{

	@Override
	public void sell(Player player, Campaign campaign, Game game) {
		System.out.println("OYUNCU: "+player.getFirstName()+ " - " +player.getLastName()+ " KAMPANYA : " +campaign.getCampaignName()+ "ÝNDÝRÝMLÝ FÝYAT :"+campaign.getLastPrice()  );
			
	}

	@Override
	public void addGame(Game game) {
		System.out.println("OYUN EKLENDÝ :" +game.getGameName());			
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("OYUN GÜNCELLENDÝ :" +game.getGameName());			
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("OYUN SÝLÝNDÝ :" +game.getGameName());			
	}

}
