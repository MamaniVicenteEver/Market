package com.ever.market.web.controller;

import com.ever.market.domain.service.CategoriaService;
import com.ever.market.persistence.entity.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

  private final CategoriaService categoriaService;

  @Autowired
  public CategoriaController(CategoriaService categoriaService) {
    this.categoriaService = categoriaService;
  }

  @GetMapping
  public ResponseEntity<List<Categoria>> getAll() {
    return ResponseEntity.ok(this.categoriaService.getAll());
  }
}
