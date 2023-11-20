package com.ever.market.web.controller;

import com.ever.market.domain.mapstruct.Product;
import com.ever.market.domain.mapstruct.Purchase;
import com.ever.market.domain.service.PurchaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

  @Autowired
  private PurchaseService purchaseService;

  @GetMapping()
  public ResponseEntity<List<Purchase>> getAll() {
    return ResponseEntity.ok(this.purchaseService.getAll());
  }
}
