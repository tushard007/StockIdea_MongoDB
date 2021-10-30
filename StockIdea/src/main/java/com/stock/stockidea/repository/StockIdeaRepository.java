package com.stock.stockidea.repository;

import java.util.Optional;

import com.stock.stockidea.entity.StockIdea;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface StockIdeaRepository extends MongoRepository<StockIdea, String> {
    @Query("{'todo': ?0}")
	Optional<StockIdea> findByTodo(String todo);
}

