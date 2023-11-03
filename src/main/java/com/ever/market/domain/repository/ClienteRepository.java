package com.ever.market.domain.repository;
import com.ever.market.persistence.crud.ClienteCrudRepository;
import com.ever.market.persistence.entity.Cliente;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository{
    ClienteCrudRepository clienteCrudRepository;
    public List<Cliente> getAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }
}
