package com.pizzarestaurant.store.service.impl;

import com.pizzarestaurant.store.dao.ToppingRepository;
import com.pizzarestaurant.store.model.Topping;
import com.pizzarestaurant.store.service.ToppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ToppingServiceImpl implements ToppingService {
  private final ToppingRepository toppingRepository;

  @Override
  public Topping save(Topping entity) {
    return null;
  }

  @Override
  public List<Topping> save(List<Topping> entities) {
    return null;
  }

  @Override
  public void deleteById(Long id) {

  }

  @Override
  public Optional<Topping> findById(Long id) {
    return Optional.empty();
  }

  @Override
  public List<Topping> findAll() {
    return null;
  }

  @Override
  public Topping update(Topping entity, Long id) {
    return null;
  }
}
