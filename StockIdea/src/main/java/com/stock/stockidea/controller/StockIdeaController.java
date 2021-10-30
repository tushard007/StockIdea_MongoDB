package com.stock.stockidea.controller;

import java.sql.Date;
import java.util.List;

import com.stock.stockidea.entity.StockIdea;
import com.stock.stockidea.service.StockIdeaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class StockIdeaController {
    @Autowired
    private StockIdeaService stockIdeaService;

    @GetMapping("/stockIdea")
    public ResponseEntity<?> getStockIdea() {
        List<StockIdea> lStockIdeas = stockIdeaService.getAllStockIdea();
        return new ResponseEntity<>(lStockIdeas, lStockIdeas.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PostMapping("/stockIdea")
    public ResponseEntity<StockIdea> saveListStockIdea(@RequestBody StockIdea stockIdea) {
        StockIdea objIdea = new StockIdea();
        objIdea.setDateCreated(new Date(System.currentTimeMillis()));
        stockIdeaService.addAllStockIdea(stockIdea);
        return new ResponseEntity<StockIdea>(HttpStatus.OK);
    }

    @PutMapping("/stockIdea")
    public ResponseEntity<?> updateListStockIdea(StockIdea stockIdea) {
        stockIdeaService.updateStockIdea(stockIdea);
        return new ResponseEntity<>("Updated Stock Idea : ", HttpStatus.OK);
    }

    @DeleteMapping("/stockIdea")
    public ResponseEntity<?> deleteStockIdea(String id) {
        stockIdeaService.deleteStockIdea(id);
        return new ResponseEntity<>("Successfully deleted Stock Idea with id "+id, HttpStatus.OK);

    }
}
