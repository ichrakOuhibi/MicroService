package com.example.stock.DTO;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class StockDTO {
    @Id
    private String  idStock;
    private String  nomProduit;
    private String zone;
    private String id_article;
    public StockDTO() {

    }

}