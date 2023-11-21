package com.ever.market.persistence.repository;

import com.ever.market.domain.mapstruct.Purchase;
import com.ever.market.domain.repository.IPurchaseRepository;
import com.ever.market.persistence.crud.CompraCrudRepository;
import com.ever.market.persistence.entity.Compra;
import com.ever.market.persistence.mapper.PurchaseMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseRepository implements IPurchaseRepository {

  @Autowired
  private CompraCrudRepository compraCrudRepository;

  @Autowired
  private PurchaseMapper mapper;

  @Override
  public List<Purchase> getAll() {
    return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
  }

  @Override
  public Optional<List<Purchase>> getByClient(String clientId) {
    return compraCrudRepository.findByIdCliente(clientId)
        .map(compras -> mapper.toPurchases(compras));
  }

  @Override
  public Purchase save(Purchase purchase) {
    Compra compra = mapper.toCompra(purchase);
    compra.getProductos().forEach(producto -> producto.setCompra(compra));

    return mapper.toPurchase(compraCrudRepository.save(compra));
  }
}
