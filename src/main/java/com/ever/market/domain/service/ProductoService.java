package com.ever.market.domain.service;

import com.ever.market.domain.mapstruct.Product;
import com.ever.market.domain.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductoService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAll() {
    return  productRepository.getAll();
  }
}
