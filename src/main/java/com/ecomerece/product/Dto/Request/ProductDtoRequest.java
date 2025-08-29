package com.ecomerece.product.Dto.Request;

import org.aspectj.lang.annotation.RequiredTypes;

public record ProductDtoRequest(
        Long id,
        String productName,
        String productDescription,
        String productCategory,
        Long productPrice
) {
}
