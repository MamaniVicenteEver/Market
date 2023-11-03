package com.ever.market.domain.service;

import com.ever.market.persistence.crud.CategoriaCrudRepository;
import com.ever.market.persistence.entity.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

  private final CategoriaCrudRepository categoriaCrudRepository;

  @Autowired
  public CategoriaService(CategoriaCrudRepository categoriaCrudRepository) {
    this.categoriaCrudRepository = categoriaCrudRepository;
  }

  public List<Categoria> getAll() {
    return (List<Categoria>) this.categoriaCrudRepository.findAll();
  }

}
