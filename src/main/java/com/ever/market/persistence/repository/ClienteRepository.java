package com.ever.market.persistence.repository;
import com.ever.market.domain.mapstruct.Customer;
import com.ever.market.domain.repository.IClienteRepository;
import com.ever.market.persistence.crud.ClienteCrudRepository;
import com.ever.market.persistence.entity.Cliente;
import com.ever.market.persistence.mapper.CustomerMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository implements IClienteRepository {

    private final ClienteCrudRepository clienteCrudRepository;

    @Autowired
    private CustomerMapper mapper;

    @Autowired
    public ClienteRepository(ClienteCrudRepository clienteCrudRepository) {
        this.clienteCrudRepository = clienteCrudRepository;
    }

    @Override
    public List<Customer> getAll() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toCustomers(clientes);
    }
}
