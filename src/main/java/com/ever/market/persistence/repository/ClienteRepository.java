package com.ever.market.persistence.repository;
import com.ever.market.persistence.crud.ClienteCrudRepository;
import com.ever.market.persistence.entity.Cliente;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository{
    private ClienteCrudRepository clienteCrudRepository;
    public List<Cliente> getAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }
}
