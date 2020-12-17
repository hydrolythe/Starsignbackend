package domain;

import java.util.Map;



public class Magic extends Card {
	
	public Spellspecies getSpecies() {
		return species;
	}

	public void setSpecies(Spellspecies species) {
		this.species = species;
	}

	public Map<Spell, Integer> getSpells() {
		return spells;
	}

	public void setSpells(Map<Spell, Integer> spells) {
		this.spells = spells;
	}

	public Map<Mana, Integer> getCost() {
		return cost;
	}

	public void setCost(Map<Mana, Integer> cost) {
		this.cost = cost;
	}

	private Spellspecies species;
	private Map<Spell,Integer> spells;
	private Map<Mana, Integer> cost;
	
	public Magic(long cardid, String title, Spellspecies species, Map<Spell,Integer> spells, Map<Mana, Integer> cost) {
		super(cardid, title);
		this.type = "Magic";
		this.species = species;
		this.spells = spells;
		this.cost = cost;
	}
}
