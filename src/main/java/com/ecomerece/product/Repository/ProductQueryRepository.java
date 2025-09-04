package com.ecomerece.product.Repository;

import com.ecomerece.product.Domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface ProductQueryRepository extends JpaRepository<ProductEntity,Long> {
    ProductEntity findByProductNameAndProductCategory(String productName,String productCategory);

    List<ProductEntity> findByProductCategory(String productCategory);
}
