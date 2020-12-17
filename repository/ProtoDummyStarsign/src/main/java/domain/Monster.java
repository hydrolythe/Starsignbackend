package domain;

import java.util.Map;

public class Monster extends Card{
	
	private Map<Mana, Integer> manarequirements;
	public Map<Mana, Integer> getManarequirements() {
		return manarequirements;
	}
	public void setManarequirements(Map<Mana, Integer> manarequirements) {
		this.manarequirements = manarequirements;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getMagicattack() {
		return magicattack;
	}
	public void setMagicattack(int magicattack) {
		this.magicattack = magicattack;
	}
	public int getMagicdefense() {
		return magicdefense;
	}
	public void setMagicdefense(int magicdefense) {
		this.magicdefense = magicdefense;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public Map<Spell, Integer> getSpells() {
		return spells;
	}
	public void setSpells(Map<Spell, Integer> spells) {
		this.spells = spells;
	}
	private int life;
	private int attack;
	private int defense;
	private int magicattack;
	private int magicdefense;
	private int mp;
	private Map<Spell,Integer> spells;
	public Monster(long cardid, String title, Map<Mana, Integer> manarequirements, int life, int attack, int defense, int magicattack,
			int magicdefense, int mp, Map<Spell, Integer> spells) {
		super(cardid, title);
		this.type="Monster";
		this.manarequirements = manarequirements;
		this.life = life;
		this.attack = attack;
		this.defense = defense;
		this.magicattack = magicattack;
		this.magicdefense = magicdefense;
		this.mp = mp;
		this.spells = spells;
	}
	
}
