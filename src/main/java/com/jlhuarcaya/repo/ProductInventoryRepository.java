package com.jlhuarcaya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlhuarcaya.model.ProductInventory;

public interface ProductInventoryRepository extends JpaRepository<ProductInventory, Long> {

}
