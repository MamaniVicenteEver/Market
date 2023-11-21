package com.ever.market.web.controller;

import com.ever.market.domain.mapstruct.Product;
import com.ever.market.domain.service.ProductoService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@OpenAPIDefinition
@RequestMapping("/products")
public class ProductoController {
  
  @Autowired
  private ProductoService productService;

  @Operation(summary = "Obtener todos los productos")
  @ApiResponse( responseCode = "200", description = "OK")
  @GetMapping("/all")
  public ResponseEntity<List<Product>> getAll() {
    return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
  }
  @GetMapping("/{id}")
  @Operation(summary = "Obtener un producto por id")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "OK"),
      @ApiResponse(responseCode = "404", description = "Product not found")
  })
  public ResponseEntity<Product> getProduct(@Parameter(description = "The id of the product", required = true, example = "7")
  @PathVariable("id") int productId) {
    return productService.getProduct(productId)
        .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping("/category/{id}")
  @Operation(summary = "Obtener productos por categoria")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "OK"),
      @ApiResponse(responseCode = "404", description = "Product not found")
  })
  public ResponseEntity<List<Product>> getByCategory(@PathVariable("id") int categoryId){

    List<Product> products = productService.getByCategory(categoryId).orElse(null);

    return products != null && !products.isEmpty() ?
        new ResponseEntity<>(products, HttpStatus.OK)
        : new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
  }

  @PostMapping("/save")
  @Operation(summary = "Guardar un producto")
  @ApiResponse(responseCode = "201", description = "CREATED")
  public ResponseEntity<Product> save(@RequestBody Product product) {
    return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
  }

  @DeleteMapping("/delete/{id}")
  @Operation(summary = "Eliminar un producto por id")
  @ApiResponse(responseCode = "200", description = "OK")
  public ResponseEntity delete(@PathVariable("id") int productId) {
    return new ResponseEntity(this.productService.delete(productId)
        ? HttpStatus.OK
        : HttpStatus.NOT_FOUND);
  }
}