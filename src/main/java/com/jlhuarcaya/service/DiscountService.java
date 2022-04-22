package com.jlhuarcaya.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlhuarcaya.model.Discount;
import com.jlhuarcaya.repo.DiscountRepository;

@Service
public class DiscountService {

  @Autowired
  private DiscountRepository discountRepository;

  public List<Discount> getDiscount() {
    return discountRepository.findAll();
  }

  public Discount create(Discount discount) {
    discount.setCreated(new Date());
    discount.setModified(new Date());
    return discountRepository.save(discount);
  }

  public Discount modify(Discount discount) {
    discount.setCreated(discountRepository.findById(discount.getId()).get().getCreated());
    discount.setModified(new Date());
    return discountRepository.save(discount);
  }

  public Discount getById(Long id) {
    return discountRepository.findById(id).get();
  }

}
