package com.ever.market.domain.repository;

import com.ever.market.domain.mapstruct.Purchase;
import java.util.List;

public interface IPurchaseRepository {

  List<Purchase> getAll();

}
