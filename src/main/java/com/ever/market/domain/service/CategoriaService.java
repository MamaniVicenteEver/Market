package com.ever.market.domain.service;

import com.ever.market.domain.mapstruct.Category;
import com.ever.market.persistence.crud.CategoriaCrudRepository;
import com.ever.market.persistence.entity.Categoria;
import com.ever.market.persistence.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

  private final CategoryRepository categoriaCrudRepository;

  @Autowired
  public CategoriaService(CategoryRepository categoriaCrudRepository) {
    this.categoriaCrudRepository = categoriaCrudRepository;
  }

  public List<Category> getAll() {
    return this.categoriaCrudRepository.getAll();
  }

}
