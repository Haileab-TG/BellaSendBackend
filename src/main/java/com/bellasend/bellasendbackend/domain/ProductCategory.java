package com.bellasend.bellasendbackend.domain;

import com.bellasend.bellasendbackend.web.dto.ProductPreviewDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductCategory extends BaseEntity{
   private String name;
   private List<ProductPreviewDto> products;
}
