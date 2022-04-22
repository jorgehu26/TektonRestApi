package com.jlhuarcaya.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jlhuarcaya.common.Constants;
import com.jlhuarcaya.model.Discount;
import com.jlhuarcaya.service.DiscountService;

@RestController
@RequestMapping(Constants.SECURE_BASE_ENDPOINT)
public class DiscountController {

  @Autowired
  private DiscountService discountService;

  @GetMapping(value = "/discount")
  public @ResponseBody List<Discount> getDiscount() {
    return discountService.getDiscount();
  }

  @PostMapping(value = "/discount")
  public @ResponseBody Discount create(@RequestBody Discount discount) {
    return discountService.create(discount);
  }

  @PutMapping(value = "/discount/{id}")
  public @ResponseBody Discount modify(@RequestBody Discount discount) {
    return discountService.modify(discount);
  }

  @GetMapping(value = "/discount/{id}")
  public @ResponseBody Discount getById(@PathVariable(value = "id") Long id) {
    return discountService.getById(id);
  }

}
