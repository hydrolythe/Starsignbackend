package dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CardDto {
	@NotNull
	@NotEmpty
	private String title;
	
	public CardDto() {
		
	}

	public CardDto(@NotNull @NotEmpty String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
