package dto;

import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import domain.Mana;
import domain.Spell;
import domain.Spellspecies;

public class SpellDto extends CardDto {
	
	public SpellDto() {
		
	}
	
	public SpellDto(@NotNull @NotEmpty String title, @NotNull @NotEmpty Spellspecies specie,
			@NotNull @NotEmpty Map<Spell, Integer> spells, @NotNull @NotEmpty Map<Mana, Integer> manaamount) {
		super(title);
		this.specie = specie;
		this.spells = spells;
		this.manaamount = manaamount;
	}
	@NotNull
	@NotEmpty
	private Spellspecies specie;
	@NotNull
	@NotEmpty
	private Map<Spell,Integer> spells;
	@NotNull
	@NotEmpty
	private Map<Mana, Integer> manaamount;
	public Spellspecies getSpecie() {
		return specie;
	}
	public void setSpecie(Spellspecies specie) {
		this.specie = specie;
	}
	public Map<Spell, Integer> getSpells() {
		return spells;
	}
	public void setSpells(Map<Spell, Integer> spells) {
		this.spells = spells;
	}
	public Map<Mana, Integer> getManaamount() {
		return manaamount;
	}
	public void setManaamount(Map<Mana, Integer> manaamount) {
		this.manaamount = manaamount;
	}
}
