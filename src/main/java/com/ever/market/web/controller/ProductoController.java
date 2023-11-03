package com.ever.market.web.controller;

import com.ever.market.domain.service.ProductoService;
import com.ever.market.persistence.entity.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {

  private final ProductoService productoService;

  @Autowired
  public ProductoController(ProductoService productoService) {
    this.productoService = productoService;
  }

  @GetMapping
  public ResponseEntity<List<Producto>> getAll() {
    return ResponseEntity.ok(this.productoService.getAll());
  }
}
