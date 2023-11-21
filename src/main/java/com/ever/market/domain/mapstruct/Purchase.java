package com.ever.market.domain.mapstruct;

import com.ever.market.persistence.entity.ComprasProducto;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Purchase {
  private int purchaseId;
  private String customerId;
  private String date;
  private String paymentMethod;
  private String comment;
  private String state;
  private List<PurchaseItem> items;

}
