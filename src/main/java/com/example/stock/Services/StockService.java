package com.example.stock.Services;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.entities.Stock;
import com.example.stock.Repository.RepoStock;

@Service
public class StockService implements IStockService{
    @Autowired
    private RepoStock stockRepository;


    public Stock addStock(Stock article) {
        return stockRepository.save(article);
    }


    public List<Stock> getAllStock() {
        return (List<Stock>) stockRepository.findAll();
    }


    public Stock getStockById(Long id) {
        return stockRepository.findById(id).get();
    }


    public Stock updateStock(Long id, Map<String, Object> stock) {
        Stock existingStock = stockRepository.findById(id).get();

        if (existingStock == null) {

            return null;
        }

        for (Map.Entry<String, Object> entry : stock.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            try {
                Field field = existingStock.getClass().getDeclaredField(key);
                field.setAccessible(true);
                field.set(existingStock, value);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return stockRepository.save(existingStock);
    }



    @Override
    public void deleteStockById(Long id) {
        stockRepository.deleteById(id);

    }

}
