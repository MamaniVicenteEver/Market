package com.ever.market.domain.service;

import com.ever.market.domain.mapstruct.Customer;
import com.ever.market.persistence.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
  private final ClienteRepository clienteCrudRepository;

  @Autowired
  public ClienteService(ClienteRepository clienteCrudRepository) {
    this.clienteCrudRepository = clienteCrudRepository;
  }

  public List<Customer> getAll() {
    return this.clienteCrudRepository.getAll();
  }
}
