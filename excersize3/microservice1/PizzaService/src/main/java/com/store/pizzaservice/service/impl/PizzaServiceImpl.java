package com.store.pizzaservice.service.impl;

import com.store.pizzaservice.dao.PizzaRepository;
import com.store.pizzaservice.dao.RestaurantIdsRepository;
import com.store.pizzaservice.model.Pizza;
import com.store.pizzaservice.model.RestaurantIds;
import com.store.pizzaservice.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PizzaServiceImpl implements PizzaService {
  private final PizzaRepository pizzaRepository;
  private final RestaurantIdsRepository restaurantIdsRepository;

  @Override
  public Pizza save(Pizza entity) {
    return pizzaRepository.save(entity);
  }

  @Override
  public List<Pizza> save(List<Pizza> entities) {
    return (List<Pizza>) pizzaRepository.saveAll(entities);
  }

  @Override
  public void deleteById(Long id) {
    pizzaRepository.deleteById(id);
  }

  @Override
  public Optional<Pizza> findById(Long id) {
    return pizzaRepository.findById(id);
  }

  @Override
  public List<Pizza> findAll() {
    return (List<Pizza>) pizzaRepository.findAll();
  }

  @Override
  public Pizza update(Pizza entity, Long id) {
    Optional<Pizza> optional = pizzaRepository.findById(id);

    if (optional.isPresent()){
      return save(entity);
    }
    return null;
  }

  @Override
  public List<Pizza> findByRestaurantId(Long restaurantId) {
    List<RestaurantIds> restaurantIds = restaurantIdsRepository.findByRestaurantId(restaurantId);
    List<Pizza> pizzas = new ArrayList<>(restaurantIds.size());

    for (RestaurantIds el:restaurantIds) {
      pizzas.add(pizzaRepository.findById(el.getPizzaId()).get());
    }

    return pizzas;
  }

  @Override
  public List<Pizza> addPizzasToRestaurant(List<RestaurantIds> restaurantIdsList) {
    List<Pizza> _pizzas = new ArrayList<>(restaurantIdsList.size());
    for (RestaurantIds el : restaurantIdsList){
      _pizzas.add(pizzaRepository.findById(el.getPizzaId()).get());
    }
    restaurantIdsRepository.saveAll(restaurantIdsList);
    return _pizzas;
  }
}
