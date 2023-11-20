package com.ever.market.domain.repository;

import com.ever.market.domain.mapstruct.Category;
import java.util.List;

public interface ICategoryRepository {
  List<Category> getAll();

}
