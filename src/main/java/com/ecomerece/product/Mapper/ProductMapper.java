package com.ecomerece.product.Mapper;

import com.ecomerece.product.Domain.ProductEntity;
import com.ecomerece.product.Dto.Request.ProductDtoRequest;
import com.ecomerece.product.Dto.Response.ProductDtoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "productId", target = "id")
    ProductDtoResponse toProductDto(ProductEntity entity);

    List<ProductDtoResponse>toProductDetailsDto(List<ProductEntity> entity);

    @Mapping(source = "id", target = "productId")
    ProductEntity toEntity(ProductDtoRequest request);

}
