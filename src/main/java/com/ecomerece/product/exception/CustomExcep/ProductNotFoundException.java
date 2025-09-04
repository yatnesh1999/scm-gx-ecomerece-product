package com.ecomerece.product.exception.CustomExcep;

import com.ecomerece.product.exception.ErrorDetail;

import java.io.Serial;

public class ProductNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID =1L;

    private final ErrorDetail errorDetail;

    public ErrorDetail getErrorDetail(){
        return errorDetail;
    }

    public ProductNotFoundException(ErrorDetail errorDetail){
        super();
        this.errorDetail=errorDetail;
    }



}
