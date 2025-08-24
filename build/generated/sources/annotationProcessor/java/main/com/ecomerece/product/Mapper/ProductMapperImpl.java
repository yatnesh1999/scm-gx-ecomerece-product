package com.ecomerece.product.Mapper;

import com.ecomerece.product.Domain.ProductEntity;
import com.ecomerece.product.Dto.Response.ProductDtoResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-24T14:49:12+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDtoResponse toProductDto(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String productName = null;
        String productDescription = null;
        String productCategory = null;
        Long productPrice = null;

        id = entity.getProductId();
        productName = entity.getProductName();
        productDescription = entity.getProductDescription();
        productCategory = entity.getProductCategory();
        productPrice = entity.getProductPrice();

        ProductDtoResponse productDtoResponse = new ProductDtoResponse( id, productName, productDescription, productCategory, productPrice );

        return productDtoResponse;
    }

    @Override
    public List<ProductDtoResponse> toProductDetailsDto(List<ProductEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<ProductDtoResponse> list = new ArrayList<ProductDtoResponse>( entity.size() );
        for ( ProductEntity productEntity : entity ) {
            list.add( toProductDto( productEntity ) );
        }

        return list;
    }
}
