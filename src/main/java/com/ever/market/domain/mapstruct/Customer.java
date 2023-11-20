package com.ever.market.domain.mapstruct;

import com.ever.market.persistence.entity.Compra;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
  private String customerId;
  private String name;
  private String lastName;
  private Long cellPhone;
  private String address;
  private String email;
  private List<Compra> purchases;
}
