package com.stock.stockidea.service;

import java.util.List;

import com.stock.stockidea.entity.StockIdea;
import com.stock.stockidea.repository.StockIdeaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockIdeaService {
@Autowired
private StockIdeaRepository stockIdeaRepository;
public List<StockIdea> getAllStockIdea(){
    return stockIdeaRepository.findAll();
}

public StockIdea getStockIdeaById(String id){
    return stockIdeaRepository.findById(id).get();
}
public StockIdea addAllStockIdea(StockIdea stockIdea){
   return stockIdeaRepository.save(stockIdea);
}
public void updateStockIdea(StockIdea stockIdea){
    stockIdeaRepository.save(stockIdea);

}
public void deleteStockIdea(String id){
    stockIdeaRepository.deleteById(id);
}

}