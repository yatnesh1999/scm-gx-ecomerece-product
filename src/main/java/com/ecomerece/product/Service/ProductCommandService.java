package com.ecomerece.product.Service;

import com.ecomerece.product.Domain.ProductEntity;
import com.ecomerece.product.Dto.Request.ProductDtoRequest;
import com.ecomerece.product.Dto.Response.ProductDtoResponse;
import com.ecomerece.product.Mapper.ProductMapper;
import com.ecomerece.product.Repository.ProductQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ProductCommandService {

    @Autowired
    ProductQueryRepository repository;

    private ProductMapper productMapper;

    public ProductDtoResponse createProduct(ProductDtoRequest request){
        Optional<ProductEntity> product = Optional.ofNullable(repository.findByProductNameAndProductCategory(request.productName(), request.productCategory()));
        if (product.isEmpty()){
            return productMapper.toProductDto(repository.save(productMapper.toEntity(request)));
        }
        return null;
    }
}
