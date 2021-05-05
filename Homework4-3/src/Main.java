
public class Main {

	public static void main(String[] args) {
		Player player1 = new Player(1, "ömer", "oður", "33333333333", 1996);

		Player player2 = new Player();
		player2.setFirstName("Enes");
		player2.setLastName("Kýlýç");
		player2.setBirthOfYear(1996);
		player2.setId(2);
		player2.setNationalityId("22222222222");

		Game game1 = new Game(1, "oyun 1", 300);

		Game game2 = new Game();
		game2.setGameName("oyun2");
		game2.setGamePrice(400);
		game2.setId(2);
		Campaign campaign1 = new Campaign(1, "ÞÝMDÝ AL SONRA ÖDE", 20, 0, game2);

		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setCampaignName("ALDIN ALDIN");
		campaign2.setDiscount(50);
		System.out.println("--------------------------------------------------");
		PlayerManager playermanager = new PlayerManager(new CheckPlayerManager());
		playermanager.addPlayer(player1);
		playermanager.deletePlayer(player1);

		System.out.println("--------------------------------------------------");

		GameManager gamemanager = new GameManager();
		gamemanager.addGame(game1);
		gamemanager.addGame(game2);
		gamemanager.sell(player1, campaign1, game1);
		gamemanager.sell(player2, campaign2, game2);

		System.out.println("--------------------------------------------------");

		CampaignManager campaignmanager = new CampaignManager();
		campaignmanager.addCampaign(campaign1);
		campaignmanager.deleteCampaign(campaign2);

	}

}
