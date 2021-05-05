
public class PlayerManager implements IPlayerManager {

	private CheckPlayerManager checkPlayerManager;

	public PlayerManager(CheckPlayerManager checkPlayerManager) {
		super();
		this.checkPlayerManager = checkPlayerManager;
	}

	@Override
	public void addPlayer(Player player) {
		if (checkPlayerManager.checkPlayer(player) == true) {
			System.out.println("Oyuncu olu�turuldu :" + player.getFirstName() + " " + player.getLastName());
		} else {
			System.out.println("K�ML�K B�LG�LER� HATALI L�TFEN KONTROL ED�N�Z");
		}

	}

	@Override
	public void deletePlayer(Player player) {
		if (checkPlayerManager.checkPlayer(player) == true) {
			System.out.println("Oyuncu silindi :" + player.getFirstName() + " " + player.getLastName());
		} else {
			System.out.println("K�ML�K B�LG�LER� HATALI L�TFEN KONTROL ED�N�Z");
		}

	}

	@Override
	public void updatePlayer(Player player) {
		if (checkPlayerManager.checkPlayer(player) == true) {
			System.out.println("Oyuncu g�ncellendi	 :" + player.getFirstName() + " " + player.getLastName());
		} else {
			System.out.println("K�ML�K B�LG�LER� HATALI L�TFEN KONTROL ED�N�Z");
		}

	}

}
