package com.ever.market.domain.repository;

import com.ever.market.domain.mapstruct.Purchase;
import java.util.List;

import java.util.Optional;

public interface IPurchaseRepository {
  List<Purchase> getAll();
  Optional<List<Purchase>> getByClient(String clientId);
  Purchase save(Purchase purchase);
}