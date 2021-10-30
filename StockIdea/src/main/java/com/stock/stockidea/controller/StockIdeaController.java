package com.stock.stockidea.controller;

import java.util.List;

import com.stock.stockidea.entity.StockIdea;
import com.stock.stockidea.service.StockIdeaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class StockIdeaController {
    @Autowired
    private StockIdeaService stockIdeaService;

    @GetMapping("/stockIdea")
    public List<StockIdea> getStockIdea() {
        return stockIdeaService.getAllStockIdea();
    }

    @PostMapping("/stockIdea")
    public List<StockIdea> saveListStockIdea(List<StockIdea> stockIdea) {
        stockIdeaService.addAllStockIdea(stockIdea);
        return stockIdea;
    }

    @PutMapping("/stockIdea")
    public StockIdea updateListStockIdea(StockIdea stockIdea) {
        stockIdeaService.updateStockIdea(stockIdea);
        return stockIdea;
    }

    @DeleteMapping ("/stockIdea")
    public void deleteStockIdea(String id) {
        stockIdeaService.deleteStockIdea(id);
    }
}
