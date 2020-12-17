package com.springBoot.jpaMysql_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import repository.CardRepository;
import repository.ICardRepository;

@SpringBootApplication
public class DummyStarsign1Application {

	public static void main(String[] args) {
		SpringApplication.run(DummyStarsign1Application.class, args);
	}

	@Bean
	public ICardRepository getCardRepository(){
		return new CardRepository();
	}
}
