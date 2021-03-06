package com.codesquad.todo5.dto.category;

import com.codesquad.todo5.domain.category.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
  private Long id;
  private String name;

  public CategoryDto(Category item) {
    this.id = item.getId();
    this.name = item.getName();
  }
}
