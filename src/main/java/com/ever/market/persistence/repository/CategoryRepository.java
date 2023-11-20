package com.ever.market.persistence.repository;

import com.ever.market.domain.mapstruct.Category;
import com.ever.market.domain.repository.ICategoryRepository;
import com.ever.market.persistence.crud.CategoriaCrudRepository;
import com.ever.market.persistence.entity.Categoria;
import com.ever.market.persistence.mapper.CategoryMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository implements ICategoryRepository {

  @Autowired
  private CategoriaCrudRepository categoriaCrudRepository;

  @Autowired
  private CategoryMapper mapper;

  @Override
  public List<Category> getAll() {
    List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
    return  mapper.toCategories(categorias);
  }
}
