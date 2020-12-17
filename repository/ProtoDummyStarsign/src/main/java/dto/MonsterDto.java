package dto;

import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import domain.Mana;
import domain.Spell;

public class MonsterDto extends CardDto {
	
	public MonsterDto() {
		
	}
	
	public MonsterDto(@NotNull @NotEmpty String title, @NotNull @NotEmpty Map<Mana, Integer> manarequirements,
			@NotNull @NotEmpty int life, @NotNull @NotEmpty int attack, @NotNull @NotEmpty int defense,
			@NotNull @NotEmpty int magicattack, @NotNull @NotEmpty int magicdefense, @NotNull @NotEmpty int mp,
			Map<Spell, Integer> spells) {
		super(title);
		this.manarequirements = manarequirements;
		this.life = life;
		this.attack = attack;
		this.defense = defense;
		this.magicattack = magicattack;
		this.magicdefense = magicdefense;
		this.mp = mp;
		this.spells = spells;
	}
	@NotNull
	@NotEmpty
	private Map<Mana, Integer> manarequirements;
	@NotNull
	@NotEmpty
	private int life;
	@NotNull
	@NotEmpty
	private int attack;
	@NotNull
	@NotEmpty
	private int defense;
	@NotNull
	@NotEmpty
	private int magicattack;
	@NotNull
	@NotEmpty
	private int magicdefense;
	@NotNull
	@NotEmpty
	private int mp;
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
	private Map<Spell, Integer> spells;
}
