package com.store.pizzaservice.service;

import com.store.pizzaservice.model.Pizza;
import com.store.pizzaservice.model.RestaurantIds;

import java.util.List;

public interface PizzaService extends GenericService<Pizza,Long> {
  List<Pizza> findByRestaurantId(Long restaurantId);

  List<Pizza> addPizzasToRestaurant(List<RestaurantIds> restaurantIds);
}
