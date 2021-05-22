	public class Campaign {
		private int id;
		private String campaignName;
		private int discount;
		private double lastPrice;
		Game gamePrice;
		public Campaign() {
			
		}
		public Campaign(int id,String campaignName,int discount, int lastPrice,Game gamePrice) {
			super();
			this.id=id;
			this.campaignName = campaignName;
			this.discount=discount;
			this.lastPrice = lastPrice;
			this.gamePrice=gamePrice;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCampaignName() {
			return campaignName;
		}
		public void setCampaignName(String campaignName) {
			this.campaignName = campaignName;
		}
		
		public int getDiscount() {
			return discount;
		}
		public void setDiscount(int discount) {
			this.discount = discount;
		}
		public double getLastPrice() {
			 return Game.gamePrice-this.discount;
		}
		
		
		

	}

