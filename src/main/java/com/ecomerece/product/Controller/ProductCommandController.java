package com.ecomerece.product.Controller;

import com.ecomerece.product.Domain.ProductEntity;
import com.ecomerece.product.Dto.Request.ProductDtoRequest;
import com.ecomerece.product.Dto.Response.ProductDtoResponse;
import com.ecomerece.product.Mapper.ProductMapper;
import com.ecomerece.product.Repository.ProductQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCommandController {

    @Autowired
    private ProductQueryRepository repository;

    @Autowired
    private ProductMapper mapper;

    @GetMapping("/test")
    public String publicEndpoint() {
        return "This is a public page.";
    }

    @PostMapping("/add/product")
    public ProductDtoResponse createProduct(@RequestBody ProductDtoRequest request){
        ProductEntity entity = repository.save(mapper.toEntity(request));
        return mapper.toProductDto(entity);
    }


}
