package com.jlhuarcaya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlhuarcaya.model.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

}
