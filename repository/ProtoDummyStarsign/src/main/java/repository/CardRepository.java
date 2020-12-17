package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import domain.Card;
import domain.Magic;
import domain.Mana;
import domain.Monster;
import domain.Source;
import domain.Spell;
import domain.Spellspecies;
import dto.CardDto;
import dto.MonsterDto;
import dto.SourceDto;
import dto.SpellDto;

public class CardRepository implements ICardRepository {
	
	private List<Card> cards;
	
	public CardRepository() {
		cards = new ArrayList<Card>();
		Map<Mana,Integer> manacost = new HashMap<Mana, Integer>();
		Monster m = new Monster(0, "Salamaximander", new HashMap<Mana, Integer>(), 5, 3, 2, 5, 2, 10, new HashMap<Spell, Integer>());
		m.getManarequirements().put(Mana.APEIRON, 3);
		m.getSpells().put(Spell.BOOSTATTACK, 3);
		cards.add(m);
		Magic s = new Magic(1, "Sword", Spellspecies.EQUIPMENT, new HashMap<Spell, Integer>(), new HashMap<Mana, Integer>());
		s.getSpells().put(Spell.BOOSTSPECIALATTACK, 5);
		s.getCost().put(Mana.ATOM, 3);
		cards.add(s);
		Source b = new Source(2, "Miletus", new HashMap<Mana, Integer>());
		b.getSource().put(Mana.APEIRON, 2);
		cards.add(b);
	}

	@Override
	public Card insert(CardDto cdto) {
		Iterator<Card> cardIterator = cards.iterator();
		Card card;
		if(cdto instanceof MonsterDto) {
			card = new Monster(cards.size(), cdto.getTitle(), ((MonsterDto) cdto).getManarequirements(), ((MonsterDto) cdto).getLife(), ((MonsterDto) cdto).getAttack(), ((MonsterDto) cdto).getDefense(), ((MonsterDto) cdto).getMagicattack(), ((MonsterDto) cdto).getMagicdefense(), ((MonsterDto) cdto).getMp(), ((MonsterDto) cdto).getSpells());
		}
		else if(cdto instanceof SpellDto) {
			card = new Magic(cards.size(), cdto.getTitle(), ((SpellDto) cdto).getSpecie(), ((SpellDto) cdto).getSpells(), ((SpellDto) cdto).getManaamount());
		} else if(cdto instanceof SourceDto){
			card = new Source(cards.size(), cdto.getTitle(), ((SourceDto) cdto).getManaamount());
		} else {
			card = new Card(cards.size(), cdto.getTitle());
		}
		while(cardIterator.hasNext()) {
			if(cardIterator.next().getTitle().equals(card.getTitle())) {
				throw new IllegalArgumentException();
			}
		}
		cards.add(card);
		return card;
	}

	@Override
	public List<Card> findAll() {
		return cards;
	}

	@Override
	public boolean exists(long cardid) {
		Iterator<Card> cardIterator = cards.iterator();
		while(cardIterator.hasNext()) {
			if(cardIterator.next().getCardid()==cardid) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void update(Card card) {
		Iterator<Card> cardIterator = cards.iterator();
		while(cardIterator.hasNext()) {
			Card nextCard = cardIterator.next();
			if(nextCard.getCardid()==card.getCardid()) {
				nextCard = card;
			}
		}
	}

	@Override
	public boolean exists(String title) {
		Iterator<Card> cardIterator = cards.iterator();
		while(cardIterator.hasNext()) {
			if(cardIterator.next().getTitle()==title) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Card delete(String title) {
		Iterator<Card> cardIterator = cards.iterator();
		while(cardIterator.hasNext()) {
			Card nextCard = cardIterator.next();
			if(nextCard.getTitle()==title) {
				cards.remove(cards.indexOf(nextCard));
				return nextCard;
			}
		}
		return null;
	}

}
