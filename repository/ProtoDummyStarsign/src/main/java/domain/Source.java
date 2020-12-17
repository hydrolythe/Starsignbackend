package domain;

import java.util.Map;


public class Source extends Card {
	
	public Map<Mana, Integer> getSource() {
		return source;
	}

	public void setSource(Map<Mana, Integer> source) {
		this.source = source;
	}

	private Map<Mana, Integer> source;

	public Source(long cardid, String title, Map<Mana, Integer> source) {
		super(cardid, title);
		this.type="Source";
		this.source = source;
	}
}
