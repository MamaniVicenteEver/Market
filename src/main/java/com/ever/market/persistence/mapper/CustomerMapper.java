package com.ever.market.persistence.mapper;

import com.ever.market.domain.mapstruct.Customer;
import com.ever.market.persistence.entity.Cliente;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  @Mappings({
      @Mapping(source = "id", target = "customerId"),
      @Mapping(source = "nombre", target = "name"),
      @Mapping(source = "apellidos", target = "lastName"),
      @Mapping(source = "celular", target = "cellPhone"),
      @Mapping(source = "direccion", target = "address"),
      @Mapping(source = "correoElectronico", target = "email"),
      @Mapping(source = "compras", target = "purchases")
  })
  Customer toCustomer(Cliente cliente);

  List<Customer> toCustomers(List<Cliente> clientes);

  @InheritInverseConfiguration
  //@Mapping(target = "compras", ignore = true)
  Cliente toCliente(Customer customer);

}
