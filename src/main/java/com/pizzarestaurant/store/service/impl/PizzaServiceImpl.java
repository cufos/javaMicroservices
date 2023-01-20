package com.pizzarestaurant.store.service.impl;

import com.pizzarestaurant.store.dao.PizzaRepository;
import com.pizzarestaurant.store.model.Pizza;
import com.pizzarestaurant.store.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PizzaServiceImpl implements PizzaService {
  private final PizzaRepository pizzaRepository;

  @Override
  public Pizza save(Pizza entity) {
    return null;
  }

  @Override
  public List<Pizza> save(List<Pizza> entities) {
    return null;
  }

  @Override
  public void deleteById(Long id) {

  }

  @Override
  public Optional<Pizza> findById(Long id) {
    return Optional.empty();
  }

  @Override
  public List<Pizza> findAll() {
    return null;
  }

  @Override
  public Pizza update(Pizza entity, Long id) {
    return null;
  }
}
