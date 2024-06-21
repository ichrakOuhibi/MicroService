package com.example.stock.Controller;

import com.example.stock.Services.IStockService;
import com.example.stock.entities.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/Stock")
public class stockController {
    @Autowired
    private IStockService stockService;


    @PostMapping("/save")
    public Stock save(@RequestBody Stock stock) {
        return stockService.addStock(stock);

    }

    @DeleteMapping("/delete/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        stockService.deleteStockById(id);

    }

    @GetMapping("/getbyid/{id}")
    public Stock GetById(@PathVariable("id") Long idStock) {
        return stockService.getStockById (idStock);
    }

    @PatchMapping("/update/{id}")
    public Stock patchUpdateStock(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        return stockService.updateStock(id, updates);

    }
}
