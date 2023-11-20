package com.ever.market.domain.service;

import com.ever.market.domain.mapstruct.Product;
import com.ever.market.domain.mapstruct.Purchase;
import com.ever.market.persistence.repository.PurchaseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

  @Autowired
  private PurchaseRepository purchaseRepository;

  public List<Purchase> getAll() {
    return  purchaseRepository.getAll();
  }
}
