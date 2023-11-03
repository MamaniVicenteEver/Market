package com.ever.market.domain.service;

import com.ever.market.persistence.entity.Producto;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ever.market.persistence.crud.ProductoCrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductoService {

  private final ProductoCrudRepository productoCrudRepository;

  @Autowired
  public ProductoService(ProductoCrudRepository productoCrudRepository) {
    this.productoCrudRepository = productoCrudRepository;
  }

  public List<Producto> getAll() {
    return (List<Producto>) this.productoCrudRepository.findAll();
  }
}
