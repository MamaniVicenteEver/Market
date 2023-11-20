package com.ever.market.domain.repository;

import com.ever.market.domain.mapstruct.Customer;
import java.util.List;

public interface IClienteRepository {

  List<Customer> getAll();
}
