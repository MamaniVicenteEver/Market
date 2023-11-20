package com.ever.market.web.controller;

import com.ever.market.domain.mapstruct.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ever.market.domain.service.ClienteService;
import com.ever.market.persistence.entity.Cliente;
import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

  private final ClienteService clienteService;

  @Autowired
  public ClienteController(ClienteService clienteService) {
    this.clienteService = clienteService;
  }

  @GetMapping
  public ResponseEntity<List<Customer>> getAll() {
    return ResponseEntity.ok(this.clienteService.getAll());
  }
}
