package com.ever.market.persistence.crud;

import com.ever.market.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

  List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

  Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}

