package com.ever.market.domain.mapstruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
  private int categoryId;
  private String category;
  private boolean active;
}
