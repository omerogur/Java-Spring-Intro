
public class CampaignManager implements ICampaignManager{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("KAMPANYA EKLEND� :" +campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("KAMPANYA G�NCELLEND� :" +campaign.getCampaignName());		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("KAMPANYA S�L�ND� :" +campaign.getCampaignName());		
	}

}
