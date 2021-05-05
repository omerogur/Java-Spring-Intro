
public class CampaignManager implements ICampaignManager{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("KAMPANYA EKLENDÝ :" +campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("KAMPANYA GÜNCELLENDÝ :" +campaign.getCampaignName());		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("KAMPANYA SÝLÝNDÝ :" +campaign.getCampaignName());		
	}

}
