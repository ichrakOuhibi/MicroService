package com.example.stock.Services;

import com.example.stock.entities.Stock;

import java.util.List;
import java.util.Map;

public interface IStockService {
    Stock addStock(Stock stock);

    Stock updateStock(Long id, Map<String, Object> stock);

    List<Stock> getAllStock();

    /*Stock getStockById(Long id);*/

    void deleteStockById(Long id);

    Stock getStockById(Long idStock);
}
