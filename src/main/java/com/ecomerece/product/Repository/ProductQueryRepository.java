package com.ecomerece.product.Repository;

import com.ecomerece.product.Domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductQueryRepository extends JpaRepository<ProductEntity,Long> {
}
