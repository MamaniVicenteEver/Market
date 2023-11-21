package com.ever.market.domain.mapstruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseItem {
    private int productId;
    private int quantity;
    private double total;
    private boolean active;
}