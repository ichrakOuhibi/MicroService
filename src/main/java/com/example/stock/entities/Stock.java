package com.example.stock.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Table(name = "Stock")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String idStock;

    String nomProduit;

    String zone;
    String id_Article;


}
