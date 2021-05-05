
public class PlayerManager implements IPlayerManager {

	private CheckPlayerManager checkPlayerManager;

	public PlayerManager(CheckPlayerManager checkPlayerManager) {
		super();
		this.checkPlayerManager = checkPlayerManager;
	}

	@Override
	public void addPlayer(Player player) {
		if (checkPlayerManager.checkPlayer(player) == true) {
			System.out.println("Oyuncu oluþturuldu :" + player.getFirstName() + " " + player.getLastName());
		} else {
			System.out.println("KÝMLÝK BÝLGÝLERÝ HATALI LÜTFEN KONTROL EDÝNÝZ");
		}

	}

	@Override
	public void deletePlayer(Player player) {
		if (checkPlayerManager.checkPlayer(player) == true) {
			System.out.println("Oyuncu silindi :" + player.getFirstName() + " " + player.getLastName());
		} else {
			System.out.println("KÝMLÝK BÝLGÝLERÝ HATALI LÜTFEN KONTROL EDÝNÝZ");
		}

	}

	@Override
	public void updatePlayer(Player player) {
		if (checkPlayerManager.checkPlayer(player) == true) {
			System.out.println("Oyuncu güncellendi	 :" + player.getFirstName() + " " + player.getLastName());
		} else {
			System.out.println("KÝMLÝK BÝLGÝLERÝ HATALI LÜTFEN KONTROL EDÝNÝZ");
		}

	}

}
