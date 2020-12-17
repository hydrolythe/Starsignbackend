package dto;

import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import domain.Mana;

public class SourceDto extends CardDto {
	
	public SourceDto() {
		
	}
	
	public SourceDto(@NotNull @NotEmpty String title, @NotNull @NotEmpty String title2,
			@NotNull @NotEmpty Map<Mana, Integer> manaamount) {
		super(title);
		title = title2;
		this.manaamount = manaamount;
	}
	@NotNull
	@NotEmpty
	private String title;
	@NotNull
	@NotEmpty
	private Map<Mana, Integer> manaamount;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Map<Mana, Integer> getManaamount() {
		return manaamount;
	}
	public void setManaamount(Map<Mana, Integer> manaamount) {
		this.manaamount = manaamount;
	}
}
