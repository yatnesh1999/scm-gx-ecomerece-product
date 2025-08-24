package com.ecomerece.product.Dto.Response;

public record ProductDtoResponse(
        Long id,
        String productName,
        String productDescription,
        String productCategory,
        Long productPrice
    ) {

}
