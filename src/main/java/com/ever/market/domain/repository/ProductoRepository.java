package com.ever.market.domain.repository;

import com.ever.market.persistence.crud.ProductoCrudRepository;
import com.ever.market.persistence.entity.Producto;
import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
