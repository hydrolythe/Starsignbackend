package repository;

import java.util.List;

import domain.Card;
import dto.CardDto;

public interface ICardRepository {
	Card insert(CardDto cd);
	List<Card> findAll();
	boolean exists(long cardid);
	boolean exists(String title);
	void update(Card card);
	Card delete(String title);
}
