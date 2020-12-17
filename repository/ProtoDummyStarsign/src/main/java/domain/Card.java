package domain;



public class Card{
	
	
	private long cardid;
	
	private String title;
	
	protected String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Card() {
		
	}
	
	public String getTitle() {
		return title;
	}

	public Card(long cardid, String title) {
		this.title = title;
		this.cardid = cardid;
	}

	public long getCardid() {
		return cardid;
	}

	public void setCardid(long cardid) {
		this.cardid = cardid;
	}
}
