package com.example.stock.Repository;

import com.example.stock.entities.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoStock extends CrudRepository<Stock, Long> {
}
