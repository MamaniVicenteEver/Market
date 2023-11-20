package com.ever.market.persistence.repository;

import com.ever.market.domain.mapstruct.Purchase;
import com.ever.market.domain.repository.IPurchaseRepository;
import com.ever.market.persistence.crud.CompraCrudRepository;
import com.ever.market.persistence.entity.Compra;
import com.ever.market.persistence.mapper.PurchaseMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseRepository implements IPurchaseRepository {

  @Autowired
  private CompraCrudRepository purchaseCrudRepository;

  @Autowired
  private PurchaseMapper mapper;


  @Override
  public List<Purchase> getAll() {
    List<Compra> compras = (List<Compra>) purchaseCrudRepository.findAll();
    return mapper.toPurchases(compras);
  }

}
