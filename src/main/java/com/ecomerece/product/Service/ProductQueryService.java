package com.ecomerece.product.Service;

import com.ecomerece.product.Domain.ProductEntity;
import com.ecomerece.product.Dto.Response.ProductDtoResponse;
import com.ecomerece.product.Mapper.ProductMapper;
import com.ecomerece.product.Repository.ProductQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductQueryService {
    @Autowired
    ProductQueryRepository productQueryRepository;

    private final ProductMapper productMapper;

    public ProductQueryService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<ProductDtoResponse> getAllProduct(){
        List<ProductEntity> data = productQueryRepository.findAll();
        return productMapper.toProductDetailsDto(data);
    }

    public List<ProductDtoResponse> getProductByCategory(String category){
        List<ProductEntity> data = productQueryRepository.findByProductCategory(category);
        return productMapper.toProductDetailsDto(data);
    }
}
