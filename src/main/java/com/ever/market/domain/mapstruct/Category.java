package com.ever.market.domain.mapstruct;

import com.ever.market.persistence.entity.Producto;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
  private int categoryId;
  private String category;
  private boolean active;

  //Ya no es necesario pero esta para ver como cuncion por que en produco ya hay una consulta que optine todos los productos de una categoria mediante el id de la categoria
  private List<Producto> product;
}
