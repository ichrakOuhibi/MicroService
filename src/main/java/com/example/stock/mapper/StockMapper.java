package com.example.stock.mapper;

import com.example.stock.DTO.ArticleDTO;
import com.example.stock.DTO.StockDTO;
import com.example.stock.entities.Stock;
import org.springframework.stereotype.Service;



@Service
public class StockMapper  {


    public static StockDTO mapToDto(Stock stock) {

        StockDTO stockDTO = StockDTO.builder()
                .idStock(stock.getIdStock())
                .nomProduit(stock.getNomProduit())
                .zone(stock.getZone())
                .id_article(stock.getId_Article())
                .build();

        return stockDTO;
    }

    public static StockDTO mapToDto(Stock stock , ArticleDTO articleDTO) {

        StockDTO stockDTO = StockDTO.builder()
                .idStock(stock.getIdStock())
                .nomProduit(stock.getNomProduit())
                .zone(stock.getZone())
                .id_article(stock.getId_Article())
                .build();

        return stockDTO;
    }

    public static Stock mapToEntity(StockDTO stockDTO) {


        Stock stock = Stock.builder()
                .idStock(stockDTO.getIdStock())
                .nomProduit(stockDTO.getNomProduit())
                .zone(stockDTO.getZone())
                .id_Article(stockDTO.getId_article())
                .build();

        return stock;

    }

}