package com.ever.market.domain.repository;

import com.ever.market.domain.mapstruct.Product;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de repositorio para acceder y gestionar datos de Productos.
 */
public interface IProductRepository {

  /**
   * Obtiene todos los productos.
   *
   * @return Una lista de todos los productos.
   */
  List<Product> getAll();

  /**
   * Obtiene productos por categoría.
   *
   * @param categoryId El ID de la categoría para filtrar productos.
   * @return Opcional que contiene una lista de productos para la categoría dada.
   */
  Optional<List<Product>> getByCategory(int categoryId);

  /**
   * Obtiene productos con inventario escaso.
   *
   * @param quantity El umbral máximo de cantidad para considerar productos escasos.
   * @return Opcional que contiene una lista de productos escasos.
   */
  Optional<List<Product>> getScarseProducts(int quantity);

  /**
   * Obtiene un producto por su ID.
   *
   * @param productId El ID del producto a recuperar.
   * @return Opcional que contiene el producto encontrado, si existe.
   */
  Optional<Product> getProduct(int productId);

  /**
   * Guarda un nuevo producto o actualiza uno existente.
   *
   * @param product El producto que se va a guardar o actualizar.
   * @return El producto guardado o actualizado.
   */
  Product save(Product product);

  /**
   * Elimina un producto por su ID.
   *
   * @param productId El ID del producto a eliminar.
   */
  void delete(int productId);
}
