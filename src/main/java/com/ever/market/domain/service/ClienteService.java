package com.ever.market.domain.service;

import com.ever.market.persistence.crud.ClienteCrudRepository;
import com.ever.market.persistence.entity.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
  private final ClienteCrudRepository clienteCrudRepository;

  @Autowired
  public ClienteService(ClienteCrudRepository clienteCrudRepository) {
    this.clienteCrudRepository = clienteCrudRepository;
  }

  public List<Cliente> getAll() {
    return (List<Cliente>) this.clienteCrudRepository.findAll();
  }
}
