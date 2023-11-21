package com.ever.market.persistence.mapper;

import com.ever.market.domain.mapstruct.Category;
import com.ever.market.persistence.entity.Categoria;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring" )
public interface CategoryMapper {
  @Mappings({
      @Mapping(source = "idCategoria", target = "categoryId"),
      @Mapping(source = "descripcion", target = "category"),
      @Mapping(source = "estado", target = "active"),
      //@Mapping(source = "productos", target = "product")
  })

  Category toCategory(Categoria categoria);

  List<Category> toCategories(List<Categoria> categorias);

  @InheritInverseConfiguration
  @Mapping(target = "productos", ignore = true)
  Categoria toCategoria(Category category);


}