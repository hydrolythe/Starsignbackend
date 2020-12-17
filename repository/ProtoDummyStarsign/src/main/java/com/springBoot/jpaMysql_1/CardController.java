package com.springBoot.jpaMysql_1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Card;
import dto.CardDto;
import repository.ICardRepository;

@RestController
@RequestMapping(value="/card")
public class CardController {

	@Autowired
	private ICardRepository cardDao;
	
	@PostMapping
	public Card addCard(@RequestBody @Valid CardDto cdto, BindingResult result){
		if(result.hasErrors()) {
			result.rejectValue("card", "message.regError");
		}
		Card card = cardDao.insert(cdto);
		return card;
	}
	
	@GetMapping
	public List<Card> getCards(){
		return cardDao.findAll();
	}
	
	@PutMapping
	public ResponseEntity.HeadersBuilder<?> updateCard(@RequestBody Card card){
		if(!cardDao.exists(card.getCardid())) {
			return ResponseEntity.notFound();
		}
		cardDao.update(card);
		return ResponseEntity.noContent();
	}
	
	@PutMapping(value="/delete")
	public List<Card> deleteCards(@RequestBody List<String> titles){
		List<Card> cards = new LinkedList<Card>();
		for(String title : titles) {
			if(cardDao.exists(title)) {
				cards.add(cardDao.delete(title));
			}
		}
		return cards;
	}
}
