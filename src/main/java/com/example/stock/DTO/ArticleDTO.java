package com.example.stock.DTO;

import com.example.stock.DTO.StockDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class ArticleDTO {

    @Id
    private Long id;
    private String name;

    private double price;

    private StockDTO stockDTO;


}