package com.ecomerece.product.Controller;

import com.ecomerece.product.Dto.Response.ProductDtoResponse;
import com.ecomerece.product.Service.ProductQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductQueryController {
    @Autowired
    ProductQueryService productQueryService;

    @GetMapping("/getAllProduct")
    public List<ProductDtoResponse> getAllProduct(){
        return productQueryService.getAllProduct();
    }

}
