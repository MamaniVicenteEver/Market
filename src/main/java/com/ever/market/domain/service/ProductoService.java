package com.ever.market.domain.service;

import com.ever.market.domain.mapstruct.Product;
import com.ever.market.persistence.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

  @Autowired
  private ProductoRepository productRepository;

  public List<Product> getAll() {
    return productRepository.getAll();
  }

  public Optional<Product> getProduct(int productId) {
    return productRepository.getProduct(productId);
  }

  public Optional<List<Product>> getByCategory(int categoryId) {
    return productRepository.getByCategory(categoryId);
  }

  @Transactional //La anotación @Transactional se utiliza para indicar que un método debe ser ejecutado dentro de una transacción.
  // Por ejemplo si algo falla en el proceso de guardado o actualizar de un producto, se debe hacer un rollback de la transacción.
  public Product save(Product product) {
    return productRepository.save(product);
  }

  public boolean delete(int productId) {
    return getProduct(productId).map(product -> {
      productRepository.delete(productId);
      return true;
    }).orElse(false);
  }
}